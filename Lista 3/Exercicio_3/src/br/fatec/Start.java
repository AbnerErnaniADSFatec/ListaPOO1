package br.fatec;
import java.text.NumberFormat;
import java.util.Scanner;
public class Start {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(" Intervalo de tempo no estacionamento: ");
		double hora = entrada.nextDouble();
		Estacionamento estacionar = new Estacionamento(hora);
		System.out.println(" -> Preço Total: " +  NumberFormat.getCurrencyInstance().format(estacionar.getPrecoFinal()));
	}
}
