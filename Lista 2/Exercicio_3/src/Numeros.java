public class Numeros {
	private int[] valores = new int[5];
	
	public Numeros(int[] valores) {
		this.valores = valores;
	}
	
	private int maior(){
		int maior = 0;
		for( int i = 0; i < 5; i++ ) {
			if( valores[i] > maior ) {
				maior = valores[i];
			}
		}
		return maior;
	}
	
	private int menor(){
		int menor = 100;
		for( int i = 0; i < 5; i++ ) {
			if( valores[i] < menor ) {
				menor = valores[i];
			}
		}
		return menor;
	}
	
	public void imprimir_lista(){
		for( int i = 0; i < 5; i++ ) {
			System.out.print(" " + valores[i]);
		}
		System.out.println("");
	}
	
	public void imprimir_maiorMenor(){
		System.out.println(" Maior = " + maior());
		System.out.println(" Menor = " + menor());
	}
}