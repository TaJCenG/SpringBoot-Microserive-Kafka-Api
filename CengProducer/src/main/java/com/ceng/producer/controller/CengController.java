package com.ceng.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceng.producer.dto.Ceng;
import com.ceng.producer.service.cengProducerService;

@RestController
@RequestMapping

public class CengController {
	
	@Autowired private cengProducerService cengService;
	
	@PostMapping("/post")
	public void sendCengData (@RequestBody Ceng ceng) {
		cengService.sendCengData(ceng);
	}
	

}
