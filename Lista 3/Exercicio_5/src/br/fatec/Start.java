package br.fatec;
import java.util.ArrayList;
public class Start {
	public static void main(String[] args) {
		Primes numeros = new Primes();
		ArrayList<Integer> primos = numeros.getPrimesByInterval( 1 , 1000 );
		for( int i = 0; i < primos.size(); i++ ){
			System.out.println( primos.get(i) );
		}
	}
}
