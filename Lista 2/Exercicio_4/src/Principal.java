import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		
		Numeros valores = new Numeros(valor1, valor2);
		valores.imprimir();
		
		entrada.close();
	}
}
