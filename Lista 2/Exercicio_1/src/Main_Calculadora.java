import java.util.Scanner;
public class Main_Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		boolean executar = true;
		
		while(executar) {
			System.out.println("\nCalculadora sofisticada e prática, sorte a sua que liberamos para testes.");
			System.out.println("\nDigite a opção desejada: ");
			System.out.println("       (1)...Soma");
			System.out.println("       (2)...Subtração");
			System.out.println("       (3)...Divisão");
			System.out.println("       (4)...Multiplicação");
			System.out.println("       (0)...Autodestruição");
			System.out.print("\n Opção => ");
			int opcao = entrada.nextInt();
			
			System.out.println("\n");
			
			double num1 = 0;
			double num2 = 0;
			
			if( opcao != 0 ){
				System.out.print("Número 1 = ");
				num1 = entrada.nextInt();
				System.out.print("Número 2 = ");
				num2 = entrada.nextInt();
			}
			
			Calculadora calcular = new Calculadora(num1,num2);

			System.out.print("\n >>> ");
			
			switch (opcao) {
				case 1:
					System.out.println("A soma é: " + calcular.soma());
					break;
					
				case 2:
					System.out.println("A subtração é: " + calcular.subtracao());
					break;
					
				case 3:
					System.out.println("A divisão é: " + calcular.divisao());
					break;
					
				case 4:
					System.out.println("A multiplicação é: " + calcular.multiplicacao());
					break;
					
				default:
					if( opcao == 0 ) {
						System.out.println("Você escolheu sair!!!");
						executar = false;
					}else{
						System.out.println("Então, digite uma opção válida, gênio!");
					}
					break;
			}
			System.out.println("\n");
		}
		entrada.close();
	}
}
