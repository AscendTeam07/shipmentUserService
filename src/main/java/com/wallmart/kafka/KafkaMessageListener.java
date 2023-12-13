package com.wallmart.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wallmart.dao.OrderInfoRepository;
import com.wallmart.dao.UserRepository;
import com.wallmart.entities.OrderInfo;
import com.wallmart.entities.User;
import com.wallmart.utilities.EmailService;

@Component
public class KafkaMessageListener {
	
	@Autowired
    OrderInfoRepository orderInfoRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
    private EmailService email;

    @KafkaListener(topics = "order_status", groupId = "javaboot_example_group_1")
    public void listen(ConsumerRecord<String, String> record) {
    	System.out.println("Message list");
        String key = record.key();
        String value = record.value();

        System.out.println("Received message from Kafka - Key: " + key + ", Value: " + value);

        Integer orderId = Integer.parseInt(key);
        String newStatus = value;

        // Update the order info table
        OrderInfo orderInfo = orderInfoRepository.findByOrderId(orderId);
        if (orderInfo != null) {
            orderInfo.setStatusOfOrder(newStatus);
            orderInfoRepository.save(orderInfo);

            // Send email to the user
            Integer userId = orderInfo.getUserId();
            User user = userRepository.findByUserId(userId);

            // Call a method to send an email using userEmail and newStatus
            String userEmail = user.getEmailId();
            String userName = user.getUserName();
            System.out.println("Sending email to: " + userEmail + " with status: " + newStatus);
            email.sendOrderUpdatesToCustomer(userEmail, orderId, orderInfo, userName);
        } else {
            System.out.println("Order not found for orderId: " + orderId);
        }
    }
//    private void sendEmail(String userEmail, String newStatus) {
//        // Implement email sending logic here using userEmail and newStatus
//        System.out.println("Sending email to: " + userEmail + " with status: " + newStatus);
//    }
}
