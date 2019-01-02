import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		/*
		Uma empresa de grande porte quer transmitir dados via internet, mas está preocupada com a possibilidade
		de seus telefones estarem grampeados. Ela pediu para você escrever um programa que criptografe os dados
		de modo que estes possam 
		ser transmitidos mais seguramente. Todos os dados são transmitidos como inteiros de quatro dígitos.
		Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e criptográfa-lo desta maneira:
		Substitua cada dígito pelo resultado da adição de 7 ao dígito e obtendo o resto depois da visão do novo
		valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então imprima
		o inteiro criptográfado. Escreva um outro aplicativo separado que receba como entrada um inteiro de quatro
		dígitos criptografado e o descriptografe para forma o número original.
		*/
		
		Scanner entrada = new java.util.Scanner(System.in);
		System.out.print("Insira um novo dado ( inteiro de quatro dígitos ) => ");
		String novoDado = entrada.next();
		
		Dado dado = new Dado(novoDado);
		dado.criptografar();
		System.out.println(" Criptografado      => " + dado.getDado());
		dado.descriptografar();
		System.out.println(" Descriptografado   => " + dado.getDado());
		
		entrada.close();
	}
}
