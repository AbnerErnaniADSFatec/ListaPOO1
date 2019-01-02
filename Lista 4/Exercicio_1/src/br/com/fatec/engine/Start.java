package br.com.fatec.engine;

import javax.swing.JOptionPane;

public class Start {
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Agenda Opções:"
						+ "\n         (4)...Listar Professores"
						+ "\n         (3)...Listar Alunos"
						+ "\n         (2)...Cadastrar Novo Professor"
						+ "\n         (1)...Cadastrar Novo Aluno"
						+ "\n         (0)...Sair"
			        )
			);
			
			switch(opcao) {
				case 1:{
					agenda.cadastrarAluno();
					break;
				}
				case 2:{
					agenda.cadastrarProfessor();
					break;
				}
				case 3:{
					if( agenda.getAlunos().isEmpty() ) {
						JOptionPane.showMessageDialog(null, "Não há alunos cadastrados ainda !!!");
					}else {
						agenda.listarAlunos();
					}
					break;
				}
				case 4:{
					if( agenda.getProfessores().isEmpty() ) {
						JOptionPane.showMessageDialog(null, "Não há professores cadastrados ainda !!!");
					}else {
						agenda.listarProfessores();
					}
					break;
				}
				default:{
					if( opcao == 0 ) {
						JOptionPane.showMessageDialog(null, "Você escolheu sair !!!");
					}else {
						JOptionPane.showMessageDialog(null, "Digite uma opção válida !!!");
					}
					break;
				}
			}
			
			
			
		}while(opcao != 0);
		
	}
}
