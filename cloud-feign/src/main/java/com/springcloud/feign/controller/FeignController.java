package com.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.feign.service.FeignService;

@RestController
public class FeignController {

	@Autowired
	FeignService feignService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(String name){
		return feignService.hi(name);
	}
	
	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String say(String name){
		return feignService.say(name);
	}
	
	@RequestMapping(value = "/say2", method = RequestMethod.GET)
	public String say2(String name){
		return restTemplate.getForObject("http://service-ribbon/hi2?name=" + name, String.class);
	}
}
