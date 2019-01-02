package br.fatec;
import java.util.Scanner;
public class Agenda {
	private Pessoa[] pessoas;
	private Scanner entrada;
	
	public Agenda( int numeroPessoas ){
		pessoas = new Pessoa[numeroPessoas];
		entrada = new Scanner( System.in );
	}
	
	public void cadastrarPessoas(){
		for( int i = 0; i < pessoas.length; i++ ){
			if( pessoas[i] == null ){
				System.out.println("\n ==== " + (i + 1) + "º Pessoa ==== ");
				System.out.print(" -> Nome: ");
				String nome = entrada.next();
				System.out.print(" -> Telefone: ");
				String telefone = entrada.next();
				System.out.print(" -> E-mail: ");
				String email = entrada.next();
				pessoas[i] = new Pessoa(nome,telefone,email);
			}
		}
		System.out.println(" ==== Contatos adiocionados ==== ");
	}
	
	public void excluirContato(){
		System.out.println("\n ==== Excluir Contato ==== ");
		System.out.print(" -> Nome do contato: ");
		String nomeToNull = entrada.next();
		if( pessoas[0] != null ){
			int index = 0;
			int tamanho_vetor = pessoas.length - 1;
			for( int i = 0; i < pessoas.length; i++ ){
				if( nomeToNull == pessoas[i].getNome() ){
					index = index + i;
					break;
				}
			}
			for( int i = index; i < tamanho_vetor; i++ ){
				pessoas[i] = pessoas[ i + 1 ];
			}
			pessoas[tamanho_vetor] = null;
			System.out.println("\n Contato Excluído !!!\n");
		}else{
			System.out.println(" Não há contatos para excluir !!!");
		}
	}
	
	public void imprimirOpcoes(){
		System.out.println("\n| ==== Agenda Telefônica ==== |");
		System.out.println("     (3)...Excluir Contato");
		System.out.println("     (2)...Listar Contatos");
		System.out.println("     (1)...Adicionar Contatos");
		System.out.println("     (0)...Sair");
	}
	
	public void imprimirPessoas(){
		if( pessoas[0] != null ){
			for( Pessoa pessoa : pessoas ){
				if( pessoa != null ){
					System.out.println("\n ==== " + pessoa.getNome() + " ==== ");
					System.out.println(" -> Telefone: " + pessoa.getTelefone());
					System.out.println(" -> E-mail: " + pessoa.getEmail());
				}
			}
		}else{
			System.out.println(" Não há contatos para exibir !!!");
		}
	}
	
	public Pessoa[] getPessoas(){
		return pessoas;
	}
	
	public void setPessoas( Pessoa[] pessoas ){
		this.pessoas = pessoas;
	}
}
