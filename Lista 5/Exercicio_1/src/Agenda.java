import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Aluno;
import modelo.Professor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class Agenda {

	private String nome;
	private String email;
	private String telefone;
	private String numeroMatricula;
	private String numeroRegistro;
	private String qtdeHoraAula;
	
	private String arqProf = System.getProperty("user.home") + System.getProperty("file.separator") + "Professores.txt";
	private String arqAluno = System.getProperty("user.home") + System.getProperty("file.separator") + "Alunos.txt";

	ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Professor> professores = new ArrayList<>();

	
	public void criarArquivo() throws IOException {
		int escolhaCA = Integer.parseInt(JOptionPane.showInputDialog(""
		+ "\n1-Exportar dados dos Professores"
		+ "\n2-Exportar dados dos Alunos"
		+ "\nDigite:"));
		
		if (escolhaCA == 1) {
		
			File caminhoProfessor = new File(arqProf);
			
			try {
				FileWriter fw = new FileWriter(caminhoProfessor);
				Writer saida = new BufferedWriter(fw);

				for (int i = 0; i < professores.size(); i++) {
					saida.write(professores.get(i).getNome().toString() + ";" 
					+ professores.get(i).getEmail().toString() + ";" 
					+ professores.get(i).getTelefone().toString() + ";"
					+ professores.get(i).getNumeroRegistro().toString() + ";"
					+ professores.get(i).getQtdeHoraAula().toString() + "\n");
				}
			
				saida.close();
				JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
				
			} catch (Exception erro) {
				
				JOptionPane.showMessageDialog(null, erro);
			}
		}
		
		
		if (escolhaCA == 2) {

			File caminhoAluno = new File(arqAluno);
			
			try {
				FileWriter fw = new FileWriter(caminhoAluno);
				Writer saida = new BufferedWriter(fw);

				for (int i = 0; i < alunos.size(); i++) {
					saida.write(alunos.get(i).getNome().toString() + ";" 
					+ alunos.get(i).getEmail().toString() + ";"
					+ alunos.get(i).getTelefone().toString() + ";"
					+ alunos.get(i).getNumeroMatricula().toString() + "\n");
				}
			
				saida.close();
				JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
				
			} catch (Exception erro) {
				
				JOptionPane.showMessageDialog(null, erro);
			}
		}
	}
	

	@SuppressWarnings("resource")
	public void lerArquivo() throws IOException, ClassNotFoundException {

		int escolhaLA = Integer.parseInt(JOptionPane.showInputDialog(""
		+ "\n1-Importar dados do Professor"
		+ "\n2-Importar dados do Aluno"
		+ "\nDigite:"));
		
		String linha;

		if (escolhaLA == 1) {
			
			String caminhoProfessor = arqProf;
			
			ArrayList<String> professores = new ArrayList<>();
			
			try {
			
				BufferedReader entrada = new BufferedReader(new FileReader(caminhoProfessor));
				
				if (!entrada.ready()) {
					throw new IOException();
				}
				
				while ((linha = entrada.readLine()) != null) {
					professores.add(linha);
				}
				
				entrada.close();
				JOptionPane.showMessageDialog(null, "Importação feita com Sucesso");
				
			} catch (IOException erro) {
				
				System.out.println(erro);
			}

			int tam = professores.size();
			
			for (int i = 0; i < tam; i++) {
				String dados = (professores.get(i));
				dados = dados.replace(",", " ");
				System.out.println(dados);
			}
			
		}
		
		
		if (escolhaLA == 2) {
		
			String caminhoAluno = (arqAluno);
			ArrayList<String> alunos = new ArrayList<>();

			try {
			
				BufferedReader entrada = new BufferedReader(new FileReader(caminhoAluno));
				
				if (!entrada.ready()) {
					throw new IOException();
				}
				
				while ((linha = entrada.readLine()) != null) {
					alunos.add(linha);
				}
				
				entrada.close();
				JOptionPane.showMessageDialog(null, "Importação feita com Sucesso");
				
			} catch (IOException erro) {
				
				System.out.println(erro);
			}

			int tam = alunos.size();
			
			for (int i = 0; i < tam; i++) {
				String dados = (alunos.get(i));
				dados = dados.replace(";", " ");
				System.out.println(dados);
			}
		} 
	}

	
	public void cadastrarAluno() {
		
		int qtde = Integer.parseInt(JOptionPane.showInputDialog(""
		+ "CADASTRAR ALUNO"
		+ "\nInsira a quantidade que deseja cadastrar:"));

		for (int i = 0; i < qtde; i++) {
			Aluno aluno = new Aluno(nome, email, telefone, numeroMatricula);
			aluno.setNome(JOptionPane.showInputDialog("Nome: "));
			aluno.setEmail(JOptionPane.showInputDialog("Email: "));
			aluno.setTelefone(JOptionPane.showInputDialog("Telefone: "));
			aluno.setNumeroMatricula(JOptionPane.showInputDialog("N° de Matrícula: "));
			alunos.add(aluno);
		}
	}

	
	public void cadastrarProfessor() {
				
		int qtde = Integer.parseInt(JOptionPane.showInputDialog(""
		+ "CADASTRAR PROFESSOR"
		+ "\nInsira a quantidade que deseja cadastrar: "));
		
		for (int i = 0; i < qtde; i++) {
			Professor prof = new Professor(nome, email, telefone, numeroRegistro, qtdeHoraAula);
			prof.setNome(JOptionPane.showInputDialog("Nome: "));
			prof.setEmail(JOptionPane.showInputDialog("Email: "));
			prof.setTelefone(JOptionPane.showInputDialog("Telefone: "));
			prof.setNumeroRegistro(JOptionPane.showInputDialog("N° de Registro: "));
			prof.setQtdeHoraAula(JOptionPane.showInputDialog("Quantidade de Hora/Aula: "));
			professores.add(prof);
		}
	}

	
	public void listarTodosAlunos() {
		
		for (Aluno a : alunos) {JOptionPane.showMessageDialog(null, ""
		+ "Nome: " + a.getNome()
		+ "\nEmail: " + a.getEmail() 
		+ "\nTelefone: " + a.getTelefone() 
		+ "\nN° de Matrícula: " + a.getNumeroMatricula());
		}
	}

	
	public void listarTodosProfessores() {
		
		for (Professor p : professores) {
			JOptionPane.showMessageDialog(null,""
			+ "Nome: " + p.getNome() 
			+ "\nEmail: " + p.getEmail()
			+ "\nTelefone: " + p.getTelefone()
			+ "\nN° de Registo: " + p.getNumeroRegistro()
			+ "\nQuantidade de Hora/Aula: " + p.getQtdeHoraAula());
		}
	}

	
	public void atualizarDadosDosAlunos() {
	
		int cont = 1;
		
		for (Aluno a : alunos) {
		
			System.out.println("[" + cont + "]"
			+ "Nome: " + a.getNome()
			+ "\nN° de Matrícula: " + a.getNumeroMatricula() + "\n");
			cont++;
		}

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira o n° do contato que deseja atualizar: "));
		
		System.out.println("[" + escolha + "]" 
		+ "Nome: " + alunos.get(escolha - 1).getNome()
		+ "\nEmail: " + alunos.get(escolha - 1).getEmail()
		+ "\nTelefone: " + alunos.get(escolha - 1).getTelefone()
		+ "\nN° de Matrícula: " + alunos.get(escolha - 1).getNumeroMatricula()
		+ "\n");

		int escolhaX = Integer.parseInt(JOptionPane.showInputDialog(
		"Insira o n° do que deseja atualizar"
		+ "\n1-Nome"
		+ "\n2-Email"
		+ "\n3-Telefone"));

		if (escolhaX == 1) {
			String novo_nome = JOptionPane.showInputDialog("Insira o novo Nome:");
			alunos.get(escolha - 1).setNome(novo_nome);

		}
		
		if (escolhaX == 2) {
			String novo_email = JOptionPane.showInputDialog("Insira o novo Email: ");
			alunos.get(escolha - 1).setEmail(novo_email);
		}
		
		if (escolhaX == 3) {
			String novo_telefone = JOptionPane.showInputDialog("Insira o novo Telefone: ");
			alunos.get(escolha - 1).setTelefone(novo_telefone);
		}
	}

	
	public void atualizarDadosDosProfessores() {
		
		int cont = 1;

		for (Professor p : professores) {
			System.out.println("[" + cont + "]" 
		    + "Nome: " + p.getNome()
		    + "\nN° de Registro: " + p.getNumeroRegistro()
			+ "\nQuantidade de Hora/Aula: " + p.getQtdeHoraAula());
			cont++;
		}

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira o n° do que deseja atualizar:"));
		
		System.out.println("[" + escolha + "]"
		+ "Nome: " + professores.get(escolha - 1).getNome()
		+ "\nE-mail: " + professores.get(escolha - 1).getEmail()
		+ "\nTelefone: " + professores.get(escolha - 1).getTelefone()
		+ "\nN° de Registro: " + professores.get(escolha - 1).getNumeroRegistro()
		+ "\nQuantidade de Hora/Aula:" + professores.get(escolha - 1).getQtdeHoraAula()
		+ "\n");

		int escolhaX = Integer.parseInt(JOptionPane.showInputDialog(""
		+ "Insira o n° do contato que deseja atualizar."
		+ "\n1-Nome"
		+ "\n2-Email"
		+ "\n3-Telefone"
		+ "\n4-Quantidade de Hora/Aula"));

		if (escolhaX == 1) {
			String novo_nome = JOptionPane.showInputDialog("Insira o novo Nome:");
			professores.get(escolha - 1).setNome(novo_nome);

		}
		
		if (escolhaX == 2) {
			String novo_email = JOptionPane.showInputDialog("Insira o novo Email:");
			professores.get(escolha - 1).setEmail(novo_email);
		}
		
		if (escolhaX == 3) {
			String novo_telefone = JOptionPane.showInputDialog("Insira o novo Telefone: ");
			professores.get(escolha - 1).setTelefone(novo_telefone);
		}
		
		if (escolhaX == 4) {
			String nova_qtde_hora_aula = JOptionPane.showInputDialog("Insira a nova quantidade de Hora/Aula: ");
			professores.get(escolha - 1).setQtdeHoraAula(nova_qtde_hora_aula);
		}
	}

	public void removerAlunos() {

		int cont = 1;
		
		for (Aluno a : alunos) {
			System.out.println("[" + cont + "]"
		    + "Nome: " + a.getNome()
		    + "\nN° de Matrícula: " + a.getNumeroMatricula() + "\n");
			cont++;
		}

		int escolhaR = Integer.parseInt(JOptionPane.showInputDialog("Insira o n° do contato que deseja remover"));

		alunos.remove(escolhaR - 1);
		JOptionPane.showMessageDialog(null, "Contato Removido");
	}

	public void removerProf() {

		int cont = 1;
		
		for (Professor p : professores) {
			System.out.println("[" + cont + "]"
			+ "Nome: " + p.getNome() 
			+ "\nN° de Registro: " + p.getNumeroRegistro() + "\n");
			cont++;
		}

		int escolhaR = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº do contato que deseja remover"));

		professores.remove(escolhaR - 1);
		JOptionPane.showMessageDialog(null, "Contato Removido");
	}
}
