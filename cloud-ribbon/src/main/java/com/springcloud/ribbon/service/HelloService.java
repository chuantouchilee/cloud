package com.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	@Autowired
    RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "error")
	public String hiService(String name) {
	    return restTemplate.getForObject("http://EUREKA-SERVICE/hi?name=" + name, String.class);
	}
	
   public String error(String name) {
	   StringBuilder sb = new StringBuilder();
	   sb.append("hi,").append(name).append(",sorry,error!");
       return sb.toString();
   }
}
