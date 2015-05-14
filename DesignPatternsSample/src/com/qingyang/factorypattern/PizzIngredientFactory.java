package com.qingyang.factorypattern;

public interface PizzIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
}
