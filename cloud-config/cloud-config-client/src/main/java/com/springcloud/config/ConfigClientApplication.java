package com.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@EnableEurekaClient
@SpringBootApplication
@RefreshScope // 刷新全局
public class ConfigClientApplication {
	
	@Autowired
	void setEnviroment(Environment env) {
	System.out.println("Environment: " 
	        +env.toString());
	    System.out.println("my-config.appName from env: " 
	        +env.getProperty("paramter.name"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
