package br.fatec;
import java.util.Scanner;
public class Start {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(" Primeiro Número = ");
		int a = entrada.nextInt();
		System.out.print(" Segundo Número = ");
		int b = entrada.nextInt();
		Numeros par = new Numeros( a , b );
		if( par.multiplo() ){
			System.out.println(" São múltiplos! ");
		}else{
			System.out.println(" Não são múltiplos! ");
		}
	}
}
