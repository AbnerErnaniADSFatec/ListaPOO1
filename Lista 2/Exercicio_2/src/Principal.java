import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		System.out.print("N�mero 1 = ");
		int numero1 = entrada.nextInt();
		System.out.print("N�mero 2 = ");
		int numero2 = entrada.nextInt();
		
		Numeros calcular = new Numeros( numero1 , numero2 );
		
		System.out.println("Soma = " + calcular.soma());
		System.out.println("M�dia = " + calcular.media());
		calcular.imprimir_Formatado();
		calcular.imprimir_Acochambrado();
		entrada.close();
	}
}