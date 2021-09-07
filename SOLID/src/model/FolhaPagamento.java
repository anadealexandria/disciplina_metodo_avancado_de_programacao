package model;

import java.util.List;

public class FolhaPagamento {
	
	public List<Pessoa> pessoas;
	float total = 0;
	
	
	public FolhaPagamento(CadastrarBancoDePessoas bancoDePessoas) {
		this.pessoas = bancoDePessoas.getPessoas(); 		
		
	}
			
	public float calcularFolha() {
		for(Pessoa pessoa: pessoas) {
			InterRemuneracao remuneracao = (InterRemuneracao) pessoa;
			total += remuneracao.remuneracao();
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "O total da folha de pagamento a ser paga é: " + calcularFolha();
	}
}
