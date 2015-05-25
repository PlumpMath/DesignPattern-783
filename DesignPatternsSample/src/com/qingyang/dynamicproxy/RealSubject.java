package com.qingyang.dynamicproxy;

public class RealSubject implements Subject {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("i want to say hello");
	}
  
}
