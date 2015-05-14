package com.qingyang.factorypattern;

public class HangZhouIngredientFactory implements PizzIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new Sauce() {
			
			@Override
			public void getSauce() {
				// TODO Auto-generated method stub
				System.out.println("hangzhou Sauce");
			}
		};
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Cheese() {
			
			@Override
			public void getCheese() {
				// TODO Auto-generated method stub
				System.out.println("hangzhou Cheese");
			}
		};
	}
}
