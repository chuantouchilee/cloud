package com.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.feign.service.FeignService;

@RestController
public class FeignController {

	@Autowired
	FeignService feignService;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String say(String name){
		return feignService.say(name);
	}
}
