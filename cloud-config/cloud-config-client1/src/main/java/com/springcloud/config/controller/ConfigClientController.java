package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties(prefix="paramter")
public class ConfigClientController {
	
//	private String name;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	@Value("${paramter.name}")
	String name;

	@RequestMapping("/print")
    public String home() {
        return "Hello World!" + name;
    }
}
