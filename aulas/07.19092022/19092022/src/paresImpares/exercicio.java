package paresImpares;

import javax.swing.JOptionPane;

public class exercicio {
/*Desenvolva um programa que receba 10 números inteiros em um vetor e só aceite números inteiros
	em um vetor e só aceite números pares nas posições pares e números impares nas posições ímpares*/
	public static void main(String[] args) {
		int[] vetParImpar = new int[10];
		String exibir=" | ";

		//para receber os númersos
			for(int i = 0; i < vetParImpar.length; i++) {
				if (i%2 == 0) {//posições pares
					vetParImpar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número par para a posição " + i));
					while (vetParImpar[i]%2 != 0) {//validar que o número é impar
						vetParImpar[i] = Integer.parseInt(JOptionPane.showInputDialog("Número inválido. Digite um número par para a posição " + i));
					}
				}else {//posições impares
					vetParImpar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ímpar para a posição " + i));
					while (vetParImpar[i]%2 == 0) {//validar que o número é impar
						vetParImpar[i] = Integer.parseInt(JOptionPane.showInputDialog("Número inválido. Digite um número ímpar para a posição " + i));
					}
				}
			}
			
			for(int i = 0; i < vetParImpar.length; i++ ) {
				exibir = exibir + vetParImpar[i] + " | ";
			}
			
			JOptionPane.showMessageDialog(null, exibir);

	}

}
