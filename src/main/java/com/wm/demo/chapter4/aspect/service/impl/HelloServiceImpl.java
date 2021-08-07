package com.wm.demo.chapter4.aspect.service.impl;

import com.wm.demo.chapter4.service.HelloService;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello(String name) {
		if (name == null || name.trim() == "") {
			throw new RuntimeException ("parameter is null!!");
		}
		System.out.println("hello " + name);
	}

}
