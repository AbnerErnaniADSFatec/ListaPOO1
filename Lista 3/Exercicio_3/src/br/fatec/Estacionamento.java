package br.fatec;
import java.lang.Math;
public class Estacionamento {
	private double hora;
	private double precoHoraAdicional;
	private double precoHoraNormal;
	
	public Estacionamento( double hora ) {
		this.hora = hora;
		precoHoraAdicional = 0.50;
		precoHoraNormal = 2.0;
	}
	
	public double getPrecoFinal(){
		if( hora <= 3 ){
			return precoHoraNormal;
		}else{
			int inteiroHora = (int)Math.round( hora - 3 );
			return precoHoraNormal + (inteiroHora * precoHoraAdicional);
		}
	}
}
