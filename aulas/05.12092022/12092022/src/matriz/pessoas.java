package matriz;

import javax.swing.*;

public class pessoas {

	public static void main(String[] args) {
		/* 
		 * Faça uma classe contendo um array bidimensional que rcebe nome e o sexo de cinco pessoas;
		 * A seguir o usuário fornece o sexo das pessoas que devem ser apresentadas na tela
		 */
		
		String[][] pessoas = new String[5][2];
		
		for(int i = 0; i < 5; i++) {
			//receber os nomes
			for(int j = 0; j < 1; j++) {
				pessoas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome da pessoa " +  (i+1)));
				//pessoas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome da pessoa " +  (i+1)));
			}//j
		}//i

		
	}

}
