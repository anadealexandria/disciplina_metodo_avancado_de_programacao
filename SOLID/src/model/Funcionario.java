package model;


public class Funcionario extends Pessoa implements InterRemuneracao{
	private float salario;
	private float comissao;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, float salario, float comissao) {
		super(nome);
		this.salario = salario;
	}
	
	public float remuneracao() {
		return salario + comissao;
	}
	
	@Override
	public String toString() {
		return "Salário: " + salario + "\n" + "Comissão: " + comissao;
	}

}
