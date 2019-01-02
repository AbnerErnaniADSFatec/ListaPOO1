package br.com.fatec.engine;

import javax.swing.JOptionPane;

public class Start {
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Agenda Op��es:"
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
						JOptionPane.showMessageDialog(null, "N�o h� alunos cadastrados ainda !!!");
					}else {
						agenda.listarAlunos();
					}
					break;
				}
				case 4:{
					if( agenda.getProfessores().isEmpty() ) {
						JOptionPane.showMessageDialog(null, "N�o h� professores cadastrados ainda !!!");
					}else {
						agenda.listarProfessores();
					}
					break;
				}
				default:{
					if( opcao == 0 ) {
						JOptionPane.showMessageDialog(null, "Voc� escolheu sair !!!");
					}else {
						JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida !!!");
					}
					break;
				}
			}
			
			
			
		}while(opcao != 0);
		
	}
}
