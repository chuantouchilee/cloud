package com.spring.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author lifuli@pinzhi365.com
 * @date 2018年3月13日 下午2:06:13
 * 
 */
@RestController
@Api("SwaggerApiController相关api")
public class SwaggerApiController {

	
	@ApiOperation(value = "wagger api : print", notes = "")
	@ApiImplicitParam(name = "msg", required = true, dataType = "String")
	@RequestMapping(value="api/print", method = RequestMethod.GET)
	public String print(String msg){
		return msg;
	}
	
	@ApiOperation(value = "wagger api : print", notes = "")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "msg", required = true, dataType = "String"),
		@ApiImplicitParam(name = "u", required = true, dataType = "String")
	})
	@RequestMapping(value="api/sysout", method = RequestMethod.GET)
	public String sysout(String msg, String u){
		return msg;
	}
}
