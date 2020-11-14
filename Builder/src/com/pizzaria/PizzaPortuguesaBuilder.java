package com.pizzaria;

public class PizzaPortuguesaBuilder extends PizzaBuilder {

	private Pizza pizza = new PizzaPortuguesa();

	public void criaMassa() {
		System.out.println("Prepara a massa da pizza.");
	}

	public void insereIngredientes() {
		System.out.println("Coloca os ingredientes da pizza portuguesa.");
	}

	public void poeNoForno() {
		System.out.println("Coloca no forno pra assar.");
	}

	public Pizza getPizza() {
		System.out.println("Pizza portuguesa pronta!");
		return pizza;
	}
}
