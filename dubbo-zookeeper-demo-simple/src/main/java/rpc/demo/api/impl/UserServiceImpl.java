package rpc.demo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;

import rpc.demo.api.UserService;

@Service(protocol = { "dubbo" })
public class UserServiceImpl implements UserService {

	@Override
	public String hello(String name) {
		System.out.println("-----------demo simple ----");
		return "hello,"+name;
	}

}
