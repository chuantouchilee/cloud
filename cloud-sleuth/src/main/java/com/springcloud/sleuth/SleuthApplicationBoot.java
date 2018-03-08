package com.springcloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * @author lifuli@pinzhi365.com
 * @date 2018年3月5日 上午9:08:26
 * 
 */
@SpringBootApplication
@EnableZipkinServer // 服务追踪
public class SleuthApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(SleuthApplicationBoot.class, args);
	}
}
