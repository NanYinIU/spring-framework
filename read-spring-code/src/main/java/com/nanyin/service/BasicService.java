package com.nanyin.service;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
	public String hello(){
		System.out.println("hello world!!");
//		System.out.println("return something ...");
//		System.out.println(1/0);
		return "xx";
	}
}
