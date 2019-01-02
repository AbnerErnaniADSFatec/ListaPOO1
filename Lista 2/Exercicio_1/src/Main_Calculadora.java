import java.util.Scanner;
public class Main_Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new java.util.Scanner(System.in);
		boolean executar = true;
		
		while(executar) {
			System.out.println("\nCalculadora sofisticada e pr�tica, sorte a sua que liberamos para testes.");
			System.out.println("\nDigite a op��o desejada: ");
			System.out.println("       (1)...Soma");
			System.out.println("       (2)...Subtra��o");
			System.out.println("       (3)...Divis�o");
			System.out.println("       (4)...Multiplica��o");
			System.out.println("       (0)...Autodestrui��o");
			System.out.print("\n Op��o => ");
			int opcao = entrada.nextInt();
			
			System.out.println("\n");
			
			double num1 = 0;
			double num2 = 0;
			
			if( opcao != 0 ){
				System.out.print("N�mero 1 = ");
				num1 = entrada.nextInt();
				System.out.print("N�mero 2 = ");
				num2 = entrada.nextInt();
			}
			
			Calculadora calcular = new Calculadora(num1,num2);

			System.out.print("\n >>> ");
			
			switch (opcao) {
				case 1:
					System.out.println("A soma �: " + calcular.soma());
					break;
					
				case 2:
					System.out.println("A subtra��o �: " + calcular.subtracao());
					break;
					
				case 3:
					System.out.println("A divis�o �: " + calcular.divisao());
					break;
					
				case 4:
					System.out.println("A multiplica��o �: " + calcular.multiplicacao());
					break;
					
				default:
					if( opcao == 0 ) {
						System.out.println("Voc� escolheu sair!!!");
						executar = false;
					}else{
						System.out.println("Ent�o, digite uma op��o v�lida, g�nio!");
					}
					break;
			}
			System.out.println("\n");
		}
		entrada.close();
	}
}
