package br.fatec;
import java.util.ArrayList;
import java.util.Scanner;
public class Agenda {
	private ArrayList<Pessoa> pessoas;
	private Scanner entrada;
	
	public Agenda(){
		pessoas = new ArrayList<Pessoa>();
		entrada = new Scanner( System.in );
	}
	
	public void cadastrarPessoas(){
		System.out.print("Quantas pessoas deseja cadastrar: ");
		int numPessoas = entrada.nextInt();
		for( int i = 0; i < numPessoas ; i++ ){
			System.out.println("\n ==== " + (i + 1) + "º Pessoa ==== ");
			System.out.print(" -> Nome: ");
			String nome = entrada.next();
			System.out.print(" -> Telefone: ");
			String telefone = entrada.next();
			System.out.print(" -> E-mail: ");
			String email = entrada.next();
			pessoas.add(new Pessoa(nome,telefone,email));
		}
		System.out.println(" ==== Contatos adiocionados ==== ");
	}
	
	
	public void excluirContato(){
		System.out.println("\n ==== Excluir Contato ==== ");
		System.out.print(" -> Nome do contato: ");
		String nomeToNull = entrada.next();
		if( pessoas.isEmpty() ){
			System.out.println(" Não há contatos para excluir !!!");
		}else{
			int index = 0;
			for( int i = 0; i < pessoas.size(); i++ ){
				if( pessoas.get(i).getNome() == nomeToNull ){
					pessoas.get(i).anular();
					index = index + i;
					break;
				}
			}
			pessoas.remove(index);
			System.out.println("\n Contato Excluído !!!\n");
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
		if( pessoas.isEmpty() ){
			System.out.println(" Não há contatos para exibir !!!");
		}else{
			for( Pessoa pessoa : pessoas ){
				if( pessoa != null ){
					System.out.println("\n ==== " + pessoa.getNome() + " ==== ");
					System.out.println(" -> Telefone: " + pessoa.getTelefone());
					System.out.println(" -> E-mail: " + pessoa.getEmail());
				}
			}
		}
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return pessoas;
	}
	
	public void setPessoas( ArrayList<Pessoa> pessoas ){
		this.pessoas = pessoas;
	}
}
