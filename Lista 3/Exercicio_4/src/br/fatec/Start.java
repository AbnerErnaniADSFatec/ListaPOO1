package br.fatec;
import java.util.Scanner;
public class Start {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(" Primeiro N�mero = ");
		int a = entrada.nextInt();
		System.out.print(" Segundo N�mero = ");
		int b = entrada.nextInt();
		Numeros par = new Numeros( a , b );
		if( par.multiplo() ){
			System.out.println(" S�o m�ltiplos! ");
		}else{
			System.out.println(" N�o s�o m�ltiplos! ");
		}
	}
}
