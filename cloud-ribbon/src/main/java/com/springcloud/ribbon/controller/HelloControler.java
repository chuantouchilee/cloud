package com.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.ribbon.service.HelloService;

@RestController
public class HelloControler {
	
	@Autowired
    RestTemplate restTemplate;

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
	
	@RequestMapping(value = "/say")
	public String say(@RequestParam String name) {
		return helloService.sayService(name);
	}
	
	@RequestMapping(value = "/hi2")
	public String hi2(@RequestParam String name) {
		return restTemplate.getForObject("http://service-feign/hi?name=" + name, String.class);
	}
	
}
