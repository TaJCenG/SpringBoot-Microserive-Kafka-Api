package com.ceng.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ceng.producer.dto.Ceng;

@Service
public class CengConsumerService {
	
	@KafkaListener(topics = {"OrderTopic"})
	public void consumerCengData(Ceng ceng){
		System.out.println("Ceng Age is :" + ceng.getAge());
		
	}

}
