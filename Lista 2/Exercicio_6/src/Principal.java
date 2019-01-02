import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		
		System.out.println(">>> Cadastrar produtos:");
		System.out.print("Funcionário: ");
		String nome = entrada.next();
		System.out.print("Numero de produtos: ");
		int n_prod = entrada.nextInt();
		
		Produto produtos[] = new Produto[n_prod];
		String marca;
		double preco;
		
		System.out.println(">>> Cadastrar novos produtos: ");
		for( int i = 0; i < n_prod; i++ ) {
			System.out.println("\n");
			System.out.print(" -> Nome do " + ( i + 1 ) + "º produto: ");
			marca = entrada.next();
			System.out.print(" -> Preço do " + ( i + 1 ) + "º  produto: ");
			preco = entrada.nextDouble();
			produtos[i] = new Produto(marca,preco);
		}
		
		Funcionario func = new Funcionario( nome , produtos);
		
		func.imprimir();
		
		entrada.close();
	}
}
