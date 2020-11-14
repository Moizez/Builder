package com.pizzaria;

public class PizzaQuatroQueijosBuilder extends PizzaBuilder{
	
	private Pizza pizza = new PizzaQuatroQueijos();

	public void criaMassa() {
		System.out.println("Prepara a massa da pizza.");
	}

	public void insereIngredientes() {
		System.out.println("Coloca os ingredientes da pizza quatro queijos.");
	}

	public void poeNoForno() {
		System.out.println("Coloca no forno pra assar.");
	}

	public Pizza getPizza() {
		System.out.println("Pizza quatro queijos pronta!");
		return pizza;
	}

}
