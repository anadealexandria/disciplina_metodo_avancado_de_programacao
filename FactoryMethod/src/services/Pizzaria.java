package services;

import model.Pizza;

public class Pizzaria implements CriarPizza{

	
	public Pizza criarPizza(String tipo) {		 
		return PizzaFactory.criar(tipo);
	}
}
