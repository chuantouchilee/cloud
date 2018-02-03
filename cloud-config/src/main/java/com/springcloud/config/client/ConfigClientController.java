package com.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${paramter}")
	private String paramter;

	@RequestMapping("/print")
    public String home() {
        return "Hello World!" + paramter;
    }
}
