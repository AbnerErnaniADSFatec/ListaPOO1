package br.fatec;
import java.text.NumberFormat;
import java.util.Scanner;
public class Start {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		int opcao = 0;
		Estoque estoque = new Estoque();
		estoque.cadastrarProduto( new Produto("a0", "P1", 1.0 , 50) );
		estoque.cadastrarProduto( new Produto("a1", "P2", 2.95 , 50) );
		estoque.cadastrarProduto( new Produto("a2", "P3", 9.98 , 50) );
		estoque.cadastrarProduto( new Produto("a3", "P4", 4.49 , 50) );
		estoque.cadastrarProduto( new Produto("a4", "P5", 6.87 , 50) );
		do{
			System.out.println("| ==== Minha Loja ==== |");
			System.out.println("     (6)...Ver total venda ");
			System.out.println("     (5)...Ver total estoque ");
			System.out.println("     (4)...Adicionar produto ao estoque ");
			System.out.println("     (3)...Registrar venda ");
			System.out.println("     (2)...Listar Produtos do Estoque ");
			System.out.println("     (1)...Listar Produtos de uma Venda ");
			System.out.println("     (0)...Sair ");
			System.out.print(" Opção => ");
			opcao = entrada.nextInt();
			String nome, codigo;
			int quantidade;
			double preco;
			switch(opcao){
			    case 1:{
			    	estoque.imprimirProdutosVenda();
			    	break;
			    }
			    case 2:{
			    	estoque.imprimirProdutosEstoque();
			    	break;
			    }
			    case 3:{
			    	System.out.println("\n ==== Registrar Venda ==== ");
			    	System.out.print(" Nome: ");
			    	nome = entrada.next();
			    	System.out.print(" Código: ");
			    	codigo = entrada.next();
			    	System.out.print(" Quantidade: ");
			    	quantidade = entrada.nextInt();
			    	estoque.venderProduto( nome , codigo , quantidade );
			    	System.out.println("\n Venda registrada com sucesso ! \n");
			    	break;
			    }
			    case 4:{
			    	System.out.println("\n ==== Cadastrar no estoque ==== ");
			    	System.out.print(" Nome: ");
			    	nome = entrada.next();
			    	System.out.print(" Código: ");
			    	codigo = entrada.next();
			    	System.out.print(" Preço: ");
			    	preco = entrada.nextDouble();
			    	System.out.print(" Quantidade: ");
			    	quantidade = entrada.nextInt();
			    	estoque.cadastrarProduto( new Produto( codigo , nome , preco , quantidade ) );
			    	System.out.println("\n Produto cadastrado com sucesso ! \n");
			    	break;
			    }
			    case 5:{
			    	System.out.println("\n Total Estoque: " + NumberFormat.getCurrencyInstance().format(estoque.somarTotalEstoque()) + " \n");
			    	break;
			    }
			    case 6:{
			    	System.out.println("\n Total Vendas: " + NumberFormat.getCurrencyInstance().format(estoque.somarTotalVendas()) + " \n");
			    	break;
			    }
			    default:{
			    	if( opcao == 0 ){
			    		System.out.println("\n Você escolheu sair !!! \n");
			    	}else{
			    		System.out.println("\n Digite uma opção válida !!! \n");
			    	}
			    	break;
			    }
			}
		}while( opcao != 0 );
	}
}
