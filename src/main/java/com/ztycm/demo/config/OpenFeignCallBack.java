package com.ztycm.demo.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ztycm.demo.controller.ServerFeignClient;

import feign.hystrix.FallbackFactory;

@Component
public class OpenFeignCallBack implements ServerFeignClient {

	@Override
	public Map<String, String> test(String id) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("errorMsg", "服务调用失败");
		return result;
	}

//	@Override
//	public ServerFeignClient create(Throwable cause) {
//		
//		return new ServerFeignClient() {
//			@Override
//			public Map<String, String> test(String id) {
//				Map<String, String> result = new HashMap<String, String>();
//				result.put("errorMsg", "服务调用失败");
//				return result;
//			}
//		};
//	}

}
