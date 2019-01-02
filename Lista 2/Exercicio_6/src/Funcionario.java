import java.text.NumberFormat;
public class Funcionario {
	private String nome;
	private Produto vendaBruta[];
	
	public Funcionario(String nome, Produto vendaBruta[]) {
		this.nome = nome;
		this.vendaBruta = vendaBruta;
	}
	
	private double calcularTotal() {
		double total = 0;
		for( int i = 0; i < vendaBruta.length; i++ ) {
			total = total + vendaBruta[i].getPreco();
		}
		return total;
	}
	
	private double calcularRendimento() {
		return ( calcularTotal() * 0.9 ) + 200;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		System.out.println("\n ==== Funcionario: " + getNome() + " ==== \n");
		System.out.println("Rendimento: " + NumberFormat.getCurrencyInstance().format( calcularRendimento() ));
		System.out.println("Total Produtos: " + NumberFormat.getCurrencyInstance().format( calcularTotal() ) + "\n");
	}
}
