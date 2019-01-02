package br.com.fatec.modelo;
public class Professor extends Pessoa{
	private String numeroRegistro;
	private String qtdeHoraAula;
	
	public Professor(String nome, String email, String telefone, String numeroRegistro, String qtdeHoraAula){
		super(nome, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.qtdeHoraAula = qtdeHoraAula;
	}
	
	public String dadosFormatados(){
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nRegistro: " + this.getNumeroRegistro();
		dadosFormatados = dadosFormatados + "\nHora/Aula: "+ this.getQtdeHoraAula();
		return dadosFormatados;
	}
	
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getQtdeHoraAula() {
		return qtdeHoraAula;
	}
	public void setQtdeHoraAula(String qtdeHoraAula) {
		this.qtdeHoraAula = qtdeHoraAula;
	}
}
