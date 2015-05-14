package com.qingyang.strategypattern;


/**
 * 
 * @author qingyang
 * strategy pattern
 * ������ڼ̳�
 */
public class Duck {  
	private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
	public void swim(){
	   System.out.println("swinming");	
	}
	
	public void quack(){
		quackBehavior.quack();
	}
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
