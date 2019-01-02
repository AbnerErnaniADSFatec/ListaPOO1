package br.fatec;
public class Numeros {
	private int a;
	private int b;
	
	public Numeros(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public boolean multiplo(){
		if( a % b == 0 ){
			return true;
		}else{
			return false;
		}
	}
}
