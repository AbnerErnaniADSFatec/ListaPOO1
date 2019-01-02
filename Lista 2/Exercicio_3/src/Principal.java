import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[5];
		Scanner entrada = new java.util.Scanner(System.in);
		
		System.out.println("Digite cinco valores inteiros:");
		for (int i = 0; i < 5; i++){
			System.out.print((i+1) + "º numero: ");
			vetor[i] = entrada.nextInt();;
		}
		entrada.close();
		
		Numeros valores = new Numeros(vetor);
		valores.imprimir_maiorMenor();
	}
}
