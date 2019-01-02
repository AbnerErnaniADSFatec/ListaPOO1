package br.fatec;
import java.util.ArrayList;
public class Primes {
	private ArrayList<Integer> primes;
	
	public Primes(){
		primes = new ArrayList<Integer>();
	}
	
	public boolean isPrime( int n ){
		int quantDivisiveis = 0;
		for( int i = 1; i <= n; i++ ){
			if( n % i == 0 ){
				quantDivisiveis = quantDivisiveis + 1;
			}
		}	
		if( quantDivisiveis == 2 ){
			return true;
		}else{
			return false;
		}
	}
	
	public ArrayList<Integer> getPrimesByInterval( int inicio , int fim ){
		for( int i = inicio; i <= fim; i++ ){
			if( isPrime(i) ){
				primes.add(i);
			}
		}
		return primes;
	}
}
