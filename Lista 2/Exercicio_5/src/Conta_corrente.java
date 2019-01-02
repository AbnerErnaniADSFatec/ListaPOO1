public abstract class Conta_corrente {
	private int numeroConta;
	private double limite;
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	protected abstract double calcularNovoSaldo();
	public abstract boolean excedeLimite();
}
