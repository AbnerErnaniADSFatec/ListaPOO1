import java.text.NumberFormat;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		
		System.out.print("Ganho por hora: ");
		double ganho = entrada.nextDouble();
		System.out.print("Horas Trabalhadas: ");
		double horas = entrada.nextDouble();
		
		Empregado empregado = new Empregado( ganho , horas );
		
		System.out.print(" Este empregado possui um salário bruto de: ");
		System.out.println(NumberFormat.getCurrencyInstance().format( empregado.calcularSalarioBruto() ));
		
		entrada.close();
	}
}