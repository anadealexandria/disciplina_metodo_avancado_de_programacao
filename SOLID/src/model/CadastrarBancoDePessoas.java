package model;

import java.util.ArrayList;
import java.util.List;

public class CadastrarBancoDePessoas implements InterCadastrarPessoa{
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public CadastrarBancoDePessoas() {
		
	}
	
	public CadastrarBancoDePessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
		
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void cadastrar(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
}

