package com.nanyin.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		// 根据BeanName和bean可以获取bean的类信息接下来就可以进行筛选，在初始化前进行相关操作
//		System.out.println(beanName);
//		return null;
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println(beanName);
//		// 同理初始化后
//		return null;
//	}
}
