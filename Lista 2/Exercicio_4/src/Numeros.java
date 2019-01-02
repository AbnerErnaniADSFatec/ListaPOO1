public class Numeros {
	private int numero1;
	private int numero2;
	
	public Numeros(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	private boolean verificarMult() {
		if( numero2 % numero1 == 0 ){
			return true;
		}else{
			return false;
		}
	}
	
	public void imprimir() {
		if (verificarMult()) {
			System.out.println("São múltiplos!");
		}else{
			System.out.println("Não são múltiplos!");
		}
	}
}