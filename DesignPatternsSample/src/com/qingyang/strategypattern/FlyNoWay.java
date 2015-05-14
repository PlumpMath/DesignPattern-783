package com.qingyang.strategypattern;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
	   System.out.println("I can not fly");	
	}
	
}
