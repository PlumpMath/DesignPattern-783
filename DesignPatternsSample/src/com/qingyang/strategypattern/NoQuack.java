package com.qingyang.strategypattern;

public class NoQuack implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("slient ...");
	}

}
