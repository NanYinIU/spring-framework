package com.nanyin.test;

public class SimpleTest {
	class A {
		void hello(){
			System.out.println("hello");
		}
	}
	public class B extends A{
		@Override
		void hello(){
			System.out.println("B`s Hello ");
			super.hello();
		}
	}

	public static void main(String[] args) {
		SimpleTest simpleTest = new SimpleTest();
		A b = simpleTest.new B();
		b.hello();
	}
}
