package com.example.ApacheKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {
	
	@Autowired
	private MessageProducer producer;
	
	
	@Autowired
	private MessageRepository messageRepo;
	@GetMapping("/send")
	public String sendMsg(@RequestParam("msg") String message) {
		producer.sendMessage(message);
		return message+" "+"sent Successfully";
		
	}
	@GetMapping("/getAll")
	
	public String getAllMessages() {
		return messageRepo.getAllMessage();
	}
	
	
	

}
