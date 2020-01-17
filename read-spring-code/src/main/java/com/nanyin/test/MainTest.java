package com.nanyin.test;

import com.nanyin.config.BasicConfig;
import com.nanyin.config.MyFactoryBean;
import com.nanyin.entity.Person;
import com.nanyin.service.BasicService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.*;

public class MainTest {
	@Test
	public void test1(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicConfig.class);
//		Person person = (Person) applicationContext.getBean("person");
		BasicService basicService = (BasicService) applicationContext.getBean("basicService");
		basicService.hello();
//		System.out.println(person);
//		BasicService basicService1 = new BasicService();
//		basicService1.hello();
	}

	@Test
	public void testAutoWired(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicConfig.class);
		Person person = (Person) applicationContext.getBean("person");
//		BasicConfig basicConfig = (BasicConfig) applicationContext.getBean("BasicConfig");
		System.out.println(person);
//		System.out.println(basicConfig);
		MyFactoryBean myFactoryBean = (MyFactoryBean) applicationContext.getBean("&myFactoryBean");
		System.out.println(myFactoryBean);
		System.out.println(applicationContext.getBean("myFactoryBean"));
		String s = "abc";
		s.toCharArray();
	}
	public int lengthOfLongestSubstring(String s) {
		char[] array = s.toCharArray();
		List<Character> window = new ArrayList<>();
		int mount = 0;
		for (char c : array) {
			if(window.contains(c)){
				if(mount < window.size()){
					mount = window.size();
				}
				int index = window.indexOf(c);
				window = window.subList(index+1,window.size());
			}
			window.add(c);
		}
		return mount<window.size()?window.size():mount;
	}

	public int lengthOfLongestSubstring2(String s){
		char[] array = s.toCharArray();
		Set<Character> window = new HashSet<>();
		int mount = 0;
		for (char c : array) {
			if(window.contains(c)){
				if(mount < window.size()){
					mount = window.size();
				}
				Iterator<Character> iterator = window.iterator();
				while(iterator.hasNext()){
					if(iterator.next()!=c){
						window.remove(iterator.next());
					}else{
						break;
					}
				}
			}
			window.add(c);
		}
		return mount<window.size()?window.size():mount;
	}

	@Test
	public void testLengthOfLongestSubstring(){
//		System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~ "));
		System.out.println(lengthOfLongestSubstring2("abcdefbba"));
	}
}
