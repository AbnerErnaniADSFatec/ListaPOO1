package br.com.fatec.modelo;
public class Aluno extends Pessoa{	
	private String numeroMatricula;
	
	public Aluno(String nome, String email, String telefone, String numeroMatricula){
		super(nome, email, telefone);
		this.numeroMatricula = numeroMatricula;
	}
	
	public String dadosFormatados(){
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados +"\nMatricula: "+ this.getNumeroMatricula();
		return dadosFormatados;
	}
	
	public String getNumeroMatricula(){
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(String numeroMatricula){
		this.numeroMatricula = numeroMatricula;
	}
}
