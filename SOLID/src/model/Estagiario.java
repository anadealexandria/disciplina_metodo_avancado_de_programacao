package model;



public class Estagiario extends Pessoa implements InterRemuneracao {
	private float bolsa;
			
	public Estagiario() {		
	}
	
	public Estagiario(String nome, float bolsa) {
		super(nome);
		this.bolsa = bolsa;
	} 
	
	public float remuneracao() {
		return bolsa;
	}
	
	@Override
	public String toString() {
		return  super.toString() + "Bolsa: " + bolsa;
	}
	
	 
}
