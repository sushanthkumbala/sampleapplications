package com.example.kafkasampleproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaprojectApplication implements ApplicationRunner {
	
	@Autowired
	   private KafkaTemplate<String, String> kafkaTemplate;

	   public void sendMessage(String msg) {
	      kafkaTemplate.send("nisum-topic1", msg);
	   }

	public static void main(String[] args) {
		SpringApplication.run(KafkaprojectApplication.class, args);
	}
	
	@KafkaListener(topics = "nisum-topic1", groupId = "spark-streaming-consumer-group")
	   public void listen(String message) {
	      System.out.println("Received Messasge in group - group-id: " + message);
	   }
	   @Override
	   public void run(ApplicationArguments args) throws Exception {
		   for(int i=0;i<10;i++) {
	      sendMessage("Hi Welcome to Spring For Apache Kafka");
	      }
	   }

}
