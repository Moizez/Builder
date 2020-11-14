package com.pizzaria;

public class Cozinha {
	
	public void fazPizza(PizzaBuilder pizza) {
		pizza.criaMassa();
		pizza.insereIngredientes();
		pizza.poeNoForno();
	}

}
