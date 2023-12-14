package com.wallmart.utilities;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.wallmart.entities.OrderInfo;
import com.wallmart.entities.Orders;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendOrderDetailsToCustomer(String customerEmail, String orderNumber, Orders order) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(customerEmail);
            helper.setSubject("Order Confirmation - Order #" + orderNumber);

            // You can customize the email content based on your requirements
            String emailContent = "<html><body>" +
                    "<p>Thank you for your order. Here are the order details:</p>" +
                    "<ul>" +
                    "<li><strong>Order Number:</strong> " + orderNumber + "</li>" +
                    "<li><strong>Product Name:</strong> " + order.getProduct().getTitle() + "</li>" +
                    "<li><strong>Customer Address:</strong> " + order.getCustomerAddress() + "</li>" +
                    "<li><strong>Customer Mobile:</strong> " + order.getCustomerMobile() + "</li>" +
                    "</ul>" +
                    "<p>Order Date: " + order.getOrderDate() + "</p>" +
                    "</body></html>";

            helper.setText(emailContent, true);

            javaMailSender.send(message);
        } catch (Exception e) {
            // Handle exceptions, log errors, or throw custom exceptions as needed
            e.printStackTrace();
        }
    }
    public void sendOrderUpdatesToCustomer(String customerEmail, int orderNumber, OrderInfo order, String uName) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(customerEmail);
            helper.setSubject("Order Update - Order #" + orderNumber);

            // You can customize the email content based on your requirements
            String emailContent = "<html><body style='background-color: #ffb6c1; padding: 20px;'>" +
                    "<div style='background-color: #ffffff; padding: 20px; border-radius: 10px;'>" +
                    "<h2 style='color: #333333;'>Order Update</h2>" +
                    "<p>Dear " + uName + ",</p>" +
                    "<p>Your order with Order Number <strong>" + orderNumber + "</strong> has been updated.</p>" +
                    "<h3 style='color: #007bff;'>Order Details:</h3>" +
                    "<ul>" +
                    "<li><strong>Order Status:</strong> " + order.getStatusOfOrder() + "</li>" +
                    "<li><strong>Order Date:</strong> " + order.getDateOfOrder() + "</li>" +
                    "</ul>" +
                    "<p style='color: #339FFF;'>Please submit your feedback <a href='https://your-feedback-url'>here</a>.</p>" +
                    "<p style='color: #339FFF;'>Please use this link to return your Order <a href='https://your-feedback-url'>here</a>.</p>" +
                    "</br><p style='color: #0EA1CC;'>Thank you for choosing us!</p>" +
                    "<div style='text-align: center;'>" +
                    "<img src='https://img.freepik.com/premium-vector/thank-you-banner-template_96807-1570.jpg' alt='Your Image' style='max-width: 100%; height: auto;'>" +
                    "</div>" +
                    "</div>" +
                    "</body></html>";
            
            helper.setText(emailContent, true);

            javaMailSender.send(message);
        } catch (Exception e) {
            // Handle exceptions, log errors, or throw custom exceptions as needed
            e.printStackTrace();
        }
    }

}
