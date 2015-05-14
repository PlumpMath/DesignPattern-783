package com.qingyang.strategypattern;


/**
 * 
 * @author qingyang
 * strategy pattern
 * 组合优于继承
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
