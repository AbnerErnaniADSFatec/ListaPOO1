import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		/*
		Uma empresa de grande porte quer transmitir dados via internet, mas est� preocupada com a possibilidade
		de seus telefones estarem grampeados. Ela pediu para voc� escrever um programa que criptografe os dados
		de modo que estes possam 
		ser transmitidos mais seguramente. Todos os dados s�o transmitidos como inteiros de quatro d�gitos.
		Seu aplicativo deve ler um inteiro de quatro d�gitos inserido pelo usu�rio e criptogr�fa-lo desta maneira:
		Substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito e obtendo o resto depois da vis�o do novo
		valor por 10. Troque ent�o o primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. Ent�o imprima
		o inteiro criptogr�fado. Escreva um outro aplicativo separado que receba como entrada um inteiro de quatro
		d�gitos criptografado e o descriptografe para forma o n�mero original.
		*/
		
		Scanner entrada = new java.util.Scanner(System.in);
		System.out.print("Insira um novo dado ( inteiro de quatro d�gitos ) => ");
		String novoDado = entrada.next();
		
		Dado dado = new Dado(novoDado);
		dado.criptografar();
		System.out.println(" Criptografado      => " + dado.getDado());
		dado.descriptografar();
		System.out.println(" Descriptografado   => " + dado.getDado());
		
		entrada.close();
	}
}
