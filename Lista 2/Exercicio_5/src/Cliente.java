public class Cliente extends Conta_corrente {
	private String nome;
	private double saldoInicial;
	private double creditoAplicado;
	private double itensCobrados;
	
	public Cliente( String nome, double saldoInicial, double creditoAplicado, double itensCobrados) {
		super();
		this.nome = nome;
		this.saldoInicial = saldoInicial;
		this.creditoAplicado = creditoAplicado;
		this.itensCobrados = itensCobrados;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected double calcularNovoSaldo() {
		return ( saldoInicial + itensCobrados ) - creditoAplicado;
	}
	
	public boolean excedeLimite() {
		if( calcularNovoSaldo() >= getLimite() ) {
			return true;
		}
		return false;
	}
}
