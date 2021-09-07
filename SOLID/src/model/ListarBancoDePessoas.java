package model;

import java.util.List;

public class ListarBancoDePessoas implements InterListarPessoas {
	private CadastrarBancoDePessoas banco;
	
	public List<Pessoa> retornarLista(CadastrarBancoDePessoas banco){
		this.banco = banco;
		return banco.getPessoas();
	}
	
	
}
