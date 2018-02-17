package com.springcloud.feign.service.impl;

import org.springframework.stereotype.Service;

import com.springcloud.feign.service.FeignService;

@Service
public class FeignServiceError implements FeignService {

	@Override
	public String say(String name) {
	StringBuilder sb = new StringBuilder();
	   sb.append("hi,").append(name).append(", error!");
	   return sb.toString();
	}

}
