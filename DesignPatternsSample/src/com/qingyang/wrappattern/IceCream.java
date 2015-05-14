package com.qingyang.wrappattern;

public class IceCream extends CondimentDecorator{

	public  IceCream(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "+ice";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 0.5;
	}

}
