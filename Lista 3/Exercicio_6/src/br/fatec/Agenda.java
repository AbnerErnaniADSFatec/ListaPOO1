package br.fatec;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
@SuppressWarnings("unchecked")
public class Agenda {
	private String caminho;
	
	public Agenda( String porta , int ano ) throws FileNotFoundException{
		caminho = porta.toUpperCase() + ":\\Agendas\\Agenda_" + ano + ".ser";
	}
	
	public List<Cliente> getClientes() throws Exception{
		try {
			FileInputStream entrada = new FileInputStream(caminho);
		    ObjectInputStream leitor = new ObjectInputStream(entrada);
		    Object objeto = leitor.readObject();
		    List<Cliente> clientes = ( List<Cliente> ) objeto;
		    leitor.close();
		    return clientes;
		} catch (Exception e) {
			return new ArrayList<Cliente>();
		}
	}
	
	public void gravarCliente( Cliente cliente , List<Cliente> clientesAntigos ) throws Exception{
		FileOutputStream saida = new FileOutputStream(caminho);
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		List<Cliente> clientes = new ArrayList<Cliente>();
		for( Cliente client : clientesAntigos ){
			clientes.add(client);
		}
		clientes.add(cliente);
		escritor.writeObject(clientes);
		escritor.close();
	}
	
	public void excluirCliente( int index , List<Cliente> clientes ) throws Exception{
		FileOutputStream saida = new FileOutputStream(caminho);
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		clientes.remove(index);
		escritor.writeObject(clientes);
		escritor.close();
	}
	
	public int getIndexClientePorNome( String nome , List<Cliente> clientes ) throws Exception{
		int index = -1;
		for( Cliente cliente : clientes ){
			index = index + 1;
			if( cliente.getNome().equals(nome) ){
				break;
			}
		}
		return index;
	}
	
	public int getIndexClientePorID( String id , List<Cliente> clientes ) throws Exception{
		int index = -1;
		for( Cliente cliente : clientes ){
			index = index + 1;
			if( cliente.getId().equals(id) ){
				break;
			}
		}
		return index;
	}
	
	public Cliente getMaisGastoCliente( List<Cliente> clientes ) throws Exception{
		double maior = 0.0;
		Cliente clienteMaisGasto = new Cliente(null,null,null,null,null,null);
		for( Cliente cliente : clientes ){
			if( cliente.getGastoPorMes() > maior ){
				maior = cliente.getGastoPorMes();
				clienteMaisGasto = cliente;
			}
		}
		return clienteMaisGasto;
	}
	
	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
}
