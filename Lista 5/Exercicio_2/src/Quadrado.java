import javax.swing.JOptionPane;

public class Quadrado {

	private static int c = 0;
	private static String x = "*";
	private static String z = "*";
	
	public static void main(String[] args) {	

		int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho dos lados do quadrado: "));
		
		if (tam >= 1 && tam <= 20){
			
			for(int i = 0; i < tam; i++){
				System.out.printf("*");
			}
	
			System.out.println("");
			
			while(c < tam - 2){
				x += " ";
				c++;
			}
	
			x += z;
			
			for(int i = 0; i < tam - 2; i++){
				System.out.println(x);
			}
			
			for(int i = 0; i < tam; i++){
				System.out.printf("*");
			}
		}else{
			System.out.printf("Insira um valor entre 1 a 20");
		}		
	}
}