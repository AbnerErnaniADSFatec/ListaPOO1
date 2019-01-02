package br.com.fatec;
import java.util.Scanner;
public class Impressora {
	public static void main(String[] args) {
		// print2();
		// print1();
		// print3();
		// impressaoQuadrado();
		// revisaoIfElse();
		// oWhile();
		// oFor();
		// calcFor();
		boolean[] coluna1 = {true,true,false,false};
		boolean[] coluna2 = {true,false,true,false};
		boolean[] resultado = new boolean[4];
		and(coluna1,coluna2,resultado);
		
	}

	public static void print1() {
		System.out.print("Tudo o que está em cima, também está embaixo!");
	}

	public static void print2() {
		System.out.println("");
	}

	public static void print3() {
		String nome = "Abner";
		String idade = "19";
		System.out.printf("%s, idade =  %s \n", nome, idade);
	}

	public static void impressaoQuadrado() {
		System.out.println("**************");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("*            *");
		System.out.println("**************");

	}

	public static void revisaoIfElse() {
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.print("Número 1 = ");
		numero1 = leitor.nextInt();
		System.out.print("Número 2 = ");
		numero2 = leitor.nextInt();
		if (numero1 > numero2)
			System.out.println("0 1 número é maior que o número 2");
		else if (numero1 < numero2)
			System.out.println("0 1 número é menor que o 2 número");
		if (numero1 == numero2)
			System.out.println("0 1 número é igual ao 2 número");
		else if (numero1 != numero2)
			System.out.println("0 1 número é diferente do 2 número");
		leitor.close();
	}

	public static void oWhile() {
		int qtdeast = 13;
		System.out.println("**************");
		while (qtdeast > 0) {
			System.out.println("*            *");
			qtdeast--;
		}
		System.out.println("**************");
	}

	public static void oFor(){
		System.out.println("**************");
		for( int quant = 13; quant > 0; quant-- )
			System.out.println("*            *");
		System.out.println("**************");
	}

	public static void calcFor() {
		Scanner leitor = new Scanner(System.in);
		boolean executar = true;
		
		while(executar) {
			System.out.println("Calculadora básica!");
			System.out.println("Digite a opção que deseja: ");
			System.out.println("  1 - SOMA");
			System.out.println("  2 - SUBTRACAO");
			System.out.println("  3 - MULTIPLICACAO");
			System.out.println("  4 - DIVISAO");
			System.out.println("  5 - SAIR");
			
			int opcao = leitor.nextInt();
			if (opcao == 1) {
				System.out.print("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.print("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 + numero2);
			}
			
			else if (opcao == 2) {
				System.out.print("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.print("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 - numero2);
				}
			else if (opcao == 3) {
				System.out.print("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.print("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 * numero2);
				}
			else if (opcao == 4) {
				System.out.print("Digite o primeiro número: ");
				int numero1 = leitor.nextInt();
				System.out.print("Digite o segundo número: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1 / numero2);
				}
			else
			{
				if(opcao == 5) 
				{
				executar = false;
				}
				else 
				{
				System.out.println("Digite uma opção válida!");
				}
			}
		}
		leitor.close();
    }
	
	public static void and( boolean[] coluna1, boolean[] coluna2, boolean[] resultado ) {
		for( int n = 0; n < 4; n++ ) {
			resultado[n] = coluna1[n] && coluna2[n];
			System.out.printf("%s and %s = %s\n", coluna1[n], coluna2[n], resultado[n]);
		}
	}
}

