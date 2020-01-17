package com.nanyin.config;

import com.nanyin.entity.Person;
import org.springframework.beans.factory.SmartFactoryBean;

public class MyFactoryBean implements SmartFactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new Person("li","a");
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
