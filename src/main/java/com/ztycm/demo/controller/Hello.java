package com.ztycm.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
	
	@Autowired
	ServerFeignClient serverFeignClient;

	@GetMapping(value = "/test")
	public Map<String, String> test(@RequestParam("id") String id){
		return serverFeignClient.test(id);
	} 
}
