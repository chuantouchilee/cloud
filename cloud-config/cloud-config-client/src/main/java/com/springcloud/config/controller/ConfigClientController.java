package com.springcloud.config.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="paramter")
public class ConfigClientController {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@RequestMapping("/print")
    public String home() {
        return "Hello World!" + name;
    }
}
