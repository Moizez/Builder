package com.pizzaria;

public abstract class PizzaBuilder {
	public abstract void criaMassa();
	public abstract void insereIngredientes();
	public abstract void poeNoForno();
	public abstract Pizza getPizza(); 
}
