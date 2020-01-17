package com.nanyin.config;

import com.nanyin.entity.Person;
import com.nanyin.entity.Pet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.support.PeriodicTrigger;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.nanyin")
public class BasicConfig {

	@Bean(value = "person")
	public Person person(){
		return new Person("1","2");
	}

	@Bean("abc")
	public Pet pet1(){
		return new Pet("abc");
	}

	@Bean("dotdot")
	@Primary
	public Pet pet2(){
		return new Pet("dotdot");
	}

	@Bean
	public MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}

	@Bean
	public MyFactoryBean myFactoryBean(){
		return new MyFactoryBean();
	}

}
