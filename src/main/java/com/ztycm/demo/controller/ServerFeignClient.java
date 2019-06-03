package com.ztycm.demo.controller;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ztycm.demo.configuration.OpenFeignCallBack;

@Component
@FeignClient(value = "YCM-SERVER", fallback=OpenFeignCallBack.class) //这里的name对应调用服务的spring.applicatoin.name
public interface ServerFeignClient {

	@GetMapping(value = "/hello/test")
	Map<String, String> test(@RequestParam("id") String id);
}
