public class Numeros {
	private int num1;
	private int num2;
	
	public Numeros( int num1 , int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int soma() {
		return num1 + num2;
	}
	
	public double media() {
		return ( num1 + num2 )/2;
	}
	
	private int max() {
		if( num1 > num2 ) {
			return num1;
		}else {
			return num2;
		}
	}
	
	private int min() {
		if( num1 < num2 ) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public void imprimir_Formatado() {
		System.out.println("Menor = " + min());
		System.out.println("Maior = " + max());
	}
	
	public void imprimir_Acochambrado() {
		System.out.print(min() + " ");
		System.out.println(max());
	}
}