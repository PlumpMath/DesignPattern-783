package com.qingyang.wrappattern;

public class Milk extends CondimentDecorator{
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"+milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 1.0;
	}
}
