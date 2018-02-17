package com.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcloud.feign.service.impl.FeignServiceError;

@FeignClient(value = "EUREKA-SERVICE", fallback = FeignServiceError.class)
public interface FeignService {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String say(@RequestParam(value = "name") String name);
}
