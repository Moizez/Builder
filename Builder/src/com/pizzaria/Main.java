package com.pizzaria;

public class Main {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();

		PizzaBuilder portuguesa = new PizzaPortuguesaBuilder();

		cozinha.fazPizza(portuguesa);
		portuguesa.getPizza();
	}
}
