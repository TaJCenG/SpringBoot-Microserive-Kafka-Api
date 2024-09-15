package com.ceng.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ceng.producer.dto.Ceng;

@Service
public class cengProducerService {
	
	@Autowired
	private KafkaTemplate<String, Integer> kafkaTemplate;
	
	public void sendCengData(Ceng ceng) {
		kafkaTemplate.send("OrderTopic", ceng.getName(), ceng.getAge());
	}

}
