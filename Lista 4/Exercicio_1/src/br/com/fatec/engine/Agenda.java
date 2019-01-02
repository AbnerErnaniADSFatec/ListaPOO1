package br.com.fatec.engine;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;

public class Agenda {
	ArrayList<Aluno> alunos;
	ArrayList<Professor> professores;
	
	public Agenda(){
		alunos = new ArrayList<>();
		professores = new ArrayList<>();
	}
	
	public void cadastrarAluno() {
		String nome = JOptionPane.showInputDialog("Nome: ");
		String email = JOptionPane.showInputDialog("Email: ");
		String telefone = JOptionPane.showInputDialog("Telefone: ");
		String numeroMatricula = JOptionPane.showInputDialog("Nª de Matrícula: ");
		Aluno aluno = new Aluno(nome,email,telefone,numeroMatricula);
		alunos.add(aluno);
	}
	
	public void cadastrarProfessor() {
		String nome = JOptionPane.showInputDialog("Nome: ");
		String email = JOptionPane.showInputDialog("Email: ");
		String telefone = JOptionPane.showInputDialog("Telefone: ");
		String numeroRegistro = JOptionPane.showInputDialog("Nª de Registro: ");
		String qtdeHoraAula = JOptionPane.showInputDialog("Quantidade Horas/Aula: ");
		Professor professor = new Professor(nome,email,telefone,numeroRegistro,qtdeHoraAula);
		professores.add(professor);
	}
	
	public void listarAlunos() {
		for( Aluno aluno : alunos ) {
			JOptionPane.showMessageDialog(null,aluno.dadosFormatados());
		}
	}
	
	public void listarProfessores() {
		for(Professor professor : professores) {
			JOptionPane.showMessageDialog(null,professor.dadosFormatados());
		}
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
}
