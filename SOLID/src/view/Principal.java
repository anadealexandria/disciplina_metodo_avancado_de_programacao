package view;


import java.util.Scanner;

import model.CadastrarBancoDePessoas;
import model.Estagiario;
import model.FolhaPagamento;
import model.Funcionario;
import model.ListarBancoDePessoas;
import model.Pessoa;


public class Principal {

	private static CadastrarBancoDePessoas bancoDePessoas = new CadastrarBancoDePessoas();
	private static ListarBancoDePessoas bancoDePessoas1 = new ListarBancoDePessoas();
	
	public static void main(String[] args) {	
		
		
		Scanner entrada = new Scanner(System.in);
		boolean controlador = true;
		while(controlador) {
		System.out.print("Digite o nome: ");
		String nome = entrada.next();
		entrada.nextLine();
					
		Pessoa pessoa1 = new Pessoa(nome);
		
		System.out.print("A pessoa é estagiária? S/N");
		String resposta =  entrada.next();
		if (resposta.equals("N") || resposta.equals("n")) {
			
			System.out.print("Qual a remuneração do funcionário?");
			//entrada.nextLine();
			float remuneracao = entrada.nextFloat();
			System.out.print("Qual a comissão do funcionário?");
			//entrada.nextLine();
			String comissao1 = entrada.next();
			
			float comissao = Float.parseFloat(comissao1);
			Funcionario funcionario1 = new Funcionario(nome, remuneracao, comissao);
			bancoDePessoas.cadastrar(funcionario1);
			
			
			
		}else {
			System.out.println("Qual o valor da bolsa: ");
			float bolsa = entrada.nextFloat();
			
			Pessoa estagiario1 = new Estagiario(pessoa1.getNome(), bolsa);
			bancoDePessoas.cadastrar(estagiario1);
		}
		
		System.out.println("Deseja continuar?S/N");
		String escolha = entrada.next();
		if(escolha.equals("N") || escolha.equals("n")) {
			controlador = false;
		}
	}
		
		FolhaPagamento folhaPag = new FolhaPagamento(bancoDePessoas);
		
		System.out.println("A listagem de dados é: " + bancoDePessoas1.retornarLista(bancoDePessoas));
		
		System.out.println(folhaPag);
		
		
	}

}
