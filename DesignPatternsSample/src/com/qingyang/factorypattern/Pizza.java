package com.qingyang.factorypattern;

public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;
	Sauce sauce;
	
	
	public abstract void prepare();
	
	
	void bake(){
		System.out.println("bake");
	}
	void cut(){
		System.out.println("cut");
	}
	void box(){
		System.out.println("box");
	}

}
