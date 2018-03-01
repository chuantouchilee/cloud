package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 刷新全局
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
