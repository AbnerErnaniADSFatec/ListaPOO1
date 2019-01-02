import java.text.NumberFormat;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		
		System.out.println(">>> Novo Cliente:");
		System.out.print("Nome: ");
		String nome = entrada.next();
		System.out.print("Saldo Inicial: ");
		double saldoInicial = entrada.nextDouble();
		System.out.print(" Credito Aplicado: ");
		double creditoAplicado = entrada.nextDouble();
		System.out.print(" Despesa Total: ");
		double precoItens = entrada.nextDouble();
		
		Conta_corrente cliente = new Cliente(nome,saldoInicial,creditoAplicado,precoItens);
		cliente.setLimite(1500);
		cliente.setNumeroConta(123456);
		
		System.out.println(">>> Cliente cadastrado com sucesso!!!");
		System.out.println("Novo Saldo =  " + NumberFormat.getCurrencyInstance().format(cliente.calcularNovoSaldo()));
		if( cliente.excedeLimite() ){
			System.out.println(" Excedeu o limite !!!");
		}else{
			System.out.println(" Não excedeu o limite !");
		}
		
		
		
		entrada.close();
	}
}
