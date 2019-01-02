package br.fatec;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Cliente implements Serializable{
	private String nome;
	private String id;
	private String email;
	private String telefone;
	private String endereco;
	private double[] gastoMes = new double[12];
	
	public Cliente(String nome, String id, String email, String telefone, String endereco, double[] gastoMes) {
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.gastoMes = gastoMes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double[] getGastoMes() {
		return gastoMes;
	}

	public void setGastoMes(double[] gastoMes) {
		this.gastoMes = gastoMes;
	}

	public double getGastoPorMes() {
		double soma = 0;
		for( int i = 0; i < 12; i++ ){
			soma = soma + gastoMes[i];
		}
		return ( soma / 12 );
	}
	
	public void anularCliente() {
		this.nome = null;
		this.telefone = null;
		this.endereco = null;
		this.gastoMes = null;
	}
}
