package alunos;

import javax.swing.JOptionPane;

public class alunos {
	public static void main(String[] args) {
	double[]notas = new double[5];
	String[]nomes = new String[5];
	double maiorNota = 0.0;
	int posicaoMaiorNota=0, i;
	
	//vetor para receber o nome dos alunos
	for(i = 0; i < notas.length; i++) {
		//inserir notas
		nomes[i] = JOptionPane.showInputDialog(
				"Digite o nome do aluno");
		notas[i] = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite uma nota para o aluno"));		
	}
	
	for(i = 0; i < notas.length; i++) {
		System.out.println("Aluno " + (i+1) + " "+ nomes[i] +  " nota: " + notas[i]);
		
		//qual a maior nota?
		if(notas[i] > maiorNota) {
		maiorNota = notas[i];
		posicaoMaiorNota = i;
	}
}
	System.out.println("A maior nota foi do aluno " + nomes[posicaoMaiorNota] + ": " + notas[posicaoMaiorNota]);
}
}
