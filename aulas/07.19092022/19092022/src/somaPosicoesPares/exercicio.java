package somaPosicoesPares;

import javax.swing.JOptionPane;

public class exercicio {
//Faça um programa em Java que recebaum vetor com 10 números inteiros e apresente a soma das posições pares
	public static void main(String[] args) {
	int[] soma = new int[10];
	int total = 0;

	//para receber os númersos
		for(int i = 0; i < soma.length; i++) {
			//inserir número
			soma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + i));
			if (i%2 == 0) {
				total = total + soma[i];
			}
		}
		
		//JOptionPane.showDialog();	
		JOptionPane.showMessageDialog(null, "A soma dos números em posições pares é " + total);
	}

}
