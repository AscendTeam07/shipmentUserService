package com.wallmart.shipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.wallmart.kafka.KafkaMessageListener;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.wallmart.dao")
@ComponentScan(basePackages = "com.wallmart.*")
@EnableScheduling
public class ShipmentApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ShipmentApplication.class, args);
    }

    @Scheduled(fixedRate = 1000) // Adjust the rate as needed
    public void pollKafka() {
        // This method will be called every second to poll for Kafka messages
    	// System.out.println("listen Rajesh list");
    }
}
