package services;

import model.Pizza;

public class Restaurante implements CriarPizza{

	public Pizza criarPizza(String tipo) {
		return PizzaFactory.criar(tipo);
	}
}
