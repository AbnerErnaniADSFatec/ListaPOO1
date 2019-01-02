package estoque;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Start {

	private static SalvarDados g = new SalvarDados();
	private static int sair = 1;
	
	public static void main(String[] args) throws IOException {

		while(sair != 0){
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(""
			+ "Controle de Estoque"
			+ "\n1 - Cadastro de produtos"
			+ "\n2 - Listar produtos"
			+ "\n3 - Atualizar Contatos"
			+ "\n4 - Remover produtos"
			+ "\n5 - Exportar Arquivo"
			+ "\n6 - Importar Arquivo"
			+ "\n0 - Sair"));
			
			switch(opcao){			
				case 1:
					g.cadastroProduto();
					break;
				case 2:
					g.exibirProduto();
					break;
				case 3:
					g.editarProduto();
					break;
				case 4:
					g.removerProduto();
					break;
				case 5:
					g.criarArquivo();
					break;
				case 6:
					g.lerArquivo();
					break;
				case 0:
					sair = 0;
					break;				
			}
		}
	}
}