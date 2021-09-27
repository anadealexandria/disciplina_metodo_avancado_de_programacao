package views;

import model.Pizza;
import services.CriarPizza;
import services.Pizzaria;
import services.Restaurante;


public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
		Pizza pizzaRes = new Pizza();
		
		CriarPizza pizzaria = new Pizzaria();
		pizza = pizzaria.criarPizza("queijo");
		System.out.println(pizza);
		
		CriarPizza restaurante = new Restaurante();
		pizzaRes = restaurante.criarPizza("frango");
		System.out.println(pizzaRes);
	}

}
