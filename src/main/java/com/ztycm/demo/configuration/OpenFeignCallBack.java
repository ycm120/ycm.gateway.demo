package com.ztycm.demo.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ztycm.demo.controller.ServerFeignClient;

@Component
public class OpenFeignCallBack implements ServerFeignClient {

	@Override
	public Map<String, String> test(String id) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("errorMsg", "服务调用失败");
		return result;
	}

}
