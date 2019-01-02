public class Calculadora {
	
	private double numero1;
	private double numero2;
	
	public Calculadora( double x , double y ) {
		numero1 = x;
		numero2 = y;
	}
	
	public double soma(){
		return (numero1 + numero2);
	}
	public double subtracao() {
		return (numero1 - numero2);
	}
	public double divisao() {
		return (numero1 / numero2);
	}
	public double multiplicacao() {
		return (numero1 * numero2);
	}
	
	
}
