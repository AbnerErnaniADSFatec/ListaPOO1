package br.fatec;
import java.util.List;
import java.io.File;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Start {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int opcao = 0;
		double[] porMes;
		int index = 0;
		int ano = 0;
		String nome, email, id, telefone, endereco;
		String porta = null;
		String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		File pasta;
		Agenda agenda;
		Cliente cliente;
		Calendar calendario = Calendar.getInstance();
		List<Cliente> clientes;
		
		do{
			System.out.println(" ==== Iniciando sua Agenda ==== ");
			System.out.println("    (2)...Iniciar uma nova agenda");
			System.out.println("    (1)...Ler uma agenda");
			System.out.print(" Opção => ");
			opcao = entrada.nextInt();
			
			switch(opcao){
			   case 1:{
				   System.out.print("\n Ano: ");
				   ano = entrada.nextInt();
				   System.out.print(" Porta: ");
				   porta = entrada.next();
				   System.out.println("\n Arquivo aberto com sucesso ! \n");
				   break;
			   }
			   case 2:{
				   ano = calendario.get(Calendar.YEAR) - 1;
				   System.out.print("\n Porta: ");
				   porta = entrada.next();
				   pasta = new File( porta.toUpperCase() + ":\\Agendas");
				   pasta.mkdir();
				   System.out.println("\n Arquivo criado com sucesso !!! \n");
				   break;
			   }
			   default:{
				   System.out.println("\n Digite uma opção válida !!! \n");
				   break;
			   }
			}
			
		}while( opcao != 1 && opcao != 2 );
		
		agenda = new Agenda( porta , ano );
		
		do{
			System.out.println("\n ==== Minha Loja ==== ");
			System.out.println("    (4)...Exibir o cliente que mais comprou na loja");
			System.out.println("    (3)...Listar clientes");
			System.out.println("    (2)...Excluir cliente");
			System.out.println("    (1)...Cadastrar cliente");
			System.out.println("    (0)...Sair");
			System.out.print(" Opção => ");
			opcao = entrada.nextInt();
			
			switch(opcao){
			   case 1:{
				   System.out.println("\n ==== Cadastrar Novo Cliente ==== ");
				   System.out.print(" -> Nome: ");
				   nome = entrada.next();
				   System.out.print(" -> ID: ");
				   id = entrada.next();
				   System.out.print(" -> E-mail: ");
				   email = entrada.next();
				   System.out.print(" -> Telefone: ");
				   telefone = entrada.next();
				   System.out.print(" -> Endereço: ");
				   endereco = entrada.next();
				   porMes = new double[12];
				   System.out.println(" ==== Gasto para cada mês ==== ");
				   for( int i = 0; i < 12; i++ ){
					   System.out.print("    - " + meses[i] + " (R$): ");
					   porMes[i] = entrada.nextDouble();
				   }
				   cliente = new Cliente(nome,id,email,telefone,endereco,porMes);
				   agenda.gravarCliente(cliente,agenda.getClientes());
				   break;
			   }
			   case 2:{
				   clientes = agenda.getClientes();
				   if( clientes.isEmpty() ){
					   System.out.println("\n Não há clientes para excluir !!! \n");
				   }else{
					   opcao = 0;
					   do{
						   System.out.println("\n ==== Excluir Cliente ==== ");
						   System.out.println("    (2)...Por ID");
						   System.out.println("    (1)...Por nome");
						   System.out.print(" Opção => ");
						   opcao = entrada.nextInt();
						   switch(opcao){
						       case 1:{
						    	   System.out.print("\n NOME: ");
								   nome = entrada.next();
								   index = agenda.getIndexClientePorNome( nome , agenda.getClientes() );
								   agenda.excluirCliente( index , agenda.getClientes() );
								   System.out.println("\n Cliente Excluído com Sucesso ! \n");
								   break;
						       }
						       case 2:{
						    	   System.out.print("\n ID: ");
								   id = entrada.next();
								   index = agenda.getIndexClientePorID(id,agenda.getClientes());
								   agenda.excluirCliente( index , agenda.getClientes() );
								   System.out.println("\n Cliente Excluído com Sucesso ! \n");
								   break;
						       }
						       default:{
						    	   System.out.println("\n Digite uma opção válida !!! \n");
						    	   break;
						       }
						   }
					   }while( opcao != 1 && opcao != 2 );
				   }
				   break;
			   }
			   case 3:{
				   clientes = agenda.getClientes();
				   if( clientes.isEmpty() ){
					   System.out.println("\n Não há clientes para exibir !!! \n");
				   }else{
					   for( Cliente client : clientes ){
						   System.out.println("\n ==== " + client.getNome() + " ==== ");
						   System.out.println(" -> ID: " + client.getId());
						   System.out.println(" -> E-mail: " + client.getEmail());
						   System.out.println(" -> Telefone: " + client.getTelefone());
						   System.out.println(" -> Endereço: " + client.getEndereco());
						   System.out.println(" -> Gasto por mês: " + NumberFormat.getCurrencyInstance().format(client.getGastoPorMes()) + "\n");
					   }
				   }
				   break;
			   }
			   case 4:{
				   clientes = agenda.getClientes();
				   if( clientes.isEmpty() ){
					   System.out.println("\n Não há clientes para calcular gasto !!! \n");
				   }else{
					   cliente = agenda.getMaisGastoCliente(agenda.getClientes());
					   System.out.println("\n O cliente que mais comprou na loja foi o " + cliente.getNome() + ".");
					   System.out.println(" Com o ID " + cliente.getId());
					   System.out.println(" Gastou " + NumberFormat.getCurrencyInstance().format(cliente.getGastoPorMes()));
				   }
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
