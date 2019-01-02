package br.fatec;
import java.text.NumberFormat;
import java.util.ArrayList;
public class Estoque {
	private ArrayList<Produto> produtos;
	private ArrayList<Produto> vendas;
	
	public Estoque(){
		this.produtos = new ArrayList<Produto>();
		this.vendas = new ArrayList<Produto>();
	}
	
	public void cadastrarProduto( Produto produto ){
		produtos.add(produto);
	}
	
	public void venderProduto(String nome , String codigo , int quantidade){
		int index = 0;
		for( Produto produto : produtos ){
			if( produto.getNome().equals(nome) ){
				break;
			}
			index++;
		}
		Produto produto = produtos.get(index);
		vendas.add( new Produto( codigo , nome , produto.getPreco() , quantidade ) );
		produtos.get(index).setQuantidade( produtos.get(index).getQuantidade() - quantidade);
	}

	public double somarTotalVendas(){
		double total = 0;
		if( vendas.isEmpty() ){
			total = 0;
		}else{
			for( Produto produto : vendas ){
				total = total + ( produto.getPreco() * produto.getQuantidade() );
			}
		}
		return total;
	}
	
	public double somarTotalEstoque(){
		double total = 0;
		if( produtos.isEmpty() ){
			total = 0;
		}else{
			for( Produto produto : produtos ){
				total = total + ( produto.getPreco() * produto.getQuantidade() );
			}
		}
		return total;
	}
	
	public void imprimirProdutosVenda(){
		if( vendas.isEmpty() ){
			System.out.println("\n Não há produtos registrados na venda ainda !!! \n");
		}else{
			for( Produto produto : vendas ){
				System.out.println("\n ==== " + produto.getNome() + " ==== ");
				System.out.println(" -> Código: " + produto.getCodigo());
				System.out.println(" -> Preço: " + NumberFormat.getCurrencyInstance().format(produto.getPreco()));
				System.out.println(" -> Quantidade: " + produto.getQuantidade() + "\n");
			}
		}
	}
	
	public void imprimirProdutosEstoque(){
		
		if( produtos.isEmpty() ){
			System.out.println("\n Não há produtos registrados na venda ainda !!! \n");
		}else{
			for( Produto produto : produtos ){
				System.out.println("\n ==== " + produto.getNome() + " ==== ");
				System.out.println(" -> Código: " + produto.getCodigo());
				System.out.println(" -> Preço: " + NumberFormat.getCurrencyInstance().format(produto.getPreco()));
				System.out.println(" -> Quantidade: " + produto.getQuantidade() + "\n");
			}
		}
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<Produto> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Produto> vendas) {
		this.vendas = vendas;
	}
}
