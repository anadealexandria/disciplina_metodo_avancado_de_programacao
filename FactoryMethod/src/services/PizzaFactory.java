package services;

import model.Pizza;

public class PizzaFactory{
				
		public static Pizza criar(String tipo) {
		
			switch (tipo) {
				case "calabresa":
					return new PizzaCalabresa();			
					
				case "frango":
					return new PizzaFrango();
					
				case "portuguesa":
					return new PizzaPortuguesa();
					
				case "queijo":
					return new PizzaQueijo();
					
				default:
					return null;
			}
	}
}
