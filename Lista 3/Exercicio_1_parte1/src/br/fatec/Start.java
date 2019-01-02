package br.fatec;
import java.util.Scanner;
public class Start {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao = 0;
		Agenda agenda = new Agenda(3);
		do{
			agenda.imprimirOpcoes();
			System.out.print(" Opção => ");
			opcao = entrada.nextInt();
			switch(opcao){
			    case 1:{
			    	agenda.cadastrarPessoas();
			    	break;
			    }
			    case 2:{
			    	agenda.imprimirPessoas();
			    	break;
			    }
			    case 3:{
			    	agenda.excluirContato();
			    	break;
			    }
			    default:{
			    	if( opcao == 0 ){
			    		System.out.println(" Você escolheu sair !!! ");
			    	}else{
			    		System.out.println(" Digite uma opção válida !!! ");
			    	}
			    }
			}
		}while( opcao != 0 );
	}
}
