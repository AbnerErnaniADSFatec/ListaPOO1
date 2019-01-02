import java.io.IOException;
import javax.swing.JOptionPane;

public class Start {

	private static Agenda a = new Agenda();
	private static int sair = 1;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		while (sair != 0) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(""
			+ "AGENDA"
			+ "\n1-Cadastrar de contato"
			+ "\n2-Listar Contato"
			+ "\n3-Atualizar Contato"
			+ "\n4-Remover Contato"
			+ "\n5-Exportar Arquivo"
			+ "\n6-Importar Arquivo"
			+ "\n0-SAIR"));

			switch (opcao) {
			// ---------------------------------------------------------
			case 1:
				int escolhaC = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "CADASTRAR CONTATO"
				+ "\n1-Professores:"
				+ "\n2-Alunos: "
				+ "\nDigite:"));

				if (escolhaC == 1) {
					a.cadastrarProfessor();
				}

				if (escolhaC == 2) {
					a.cadastrarAluno();
				}

				break;
			// ---------------------------------------------------------
			case 2:

				int escolhaE = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "LISTAR CONTATO"
				+ "\n1-Professores:"
				+ "\n2-Alunos: "
				+ "\nDigite:"));

				if (escolhaE == 1) {
					a.listarTodosProfessores();
				}

				if (escolhaE == 2) {
					a.listarTodosAlunos();
				} 

				break;
			// ---------------------------------------------------------
			case 3:

				int escolhaEdit = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "ATUALIZAR CONTATO"
				+ "\n1-Professores:"
				+ "\n2-Alunos: "
				+ "\nDigite:"));

				if (escolhaEdit == 1) {
					a.atualizarDadosDosProfessores();
				}

				if (escolhaEdit == 2) {
					a.atualizarDadosDosAlunos();
				}

				break;
			// ---------------------------------------------------------
			case 4:
				int escolhaD = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "REMOVER CONTATO"
				+ "\n1-Professores:"
				+ "\n2-Alunos: "
				+ "\nDigite:"));

				if (escolhaD == 1) {
					a.removerProf();

				}
				
				if (escolhaD == 2) {
					a.removerAlunos();

				} 

				break;
			// ---------------------------------------------------------
			case 5:
				a.criarArquivo();
				break;
			// ---------------------------------------------------------
			case 6:
				a.lerArquivo();
				break;
			// ---------------------------------------------------------
			case 0:
				sair = 0;
				break;
			// ---------------------------------------------------------
			}
		}
	}
}
