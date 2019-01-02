public class Empregado {
	private double porHora;
	private double horasTrabalhadas;
	
	public Empregado(double porHora, double horasTrabalhadas) {
		this.porHora = porHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	private double getHoraMais(){
		return horasTrabalhadas - 40;
	}
	
	private double getMetade(){
		return ( porHora * 0.50 );
	}
	
	public double calcularSalarioBruto(){
		double salario = 0;
		if( horasTrabalhadas > 40 ){
			salario = ( 40 * porHora ) + ( getHoraMais() * ( porHora + getMetade() ) );
		}else{
			salario = horasTrabalhadas * porHora;
		}
		return salario;
	}
}
