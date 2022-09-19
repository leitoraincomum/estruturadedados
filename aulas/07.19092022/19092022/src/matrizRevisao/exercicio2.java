package matrizRevisao;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		/*2. Faça um programa que receba duas matrizes A e B e imprima o produto A*B na matriz C*/
		int [][]matrizA = new int[3][3];
		int [][]matrizB = new int[3][3];
		int [][]matrizC = new int[3][3];
		String exibirA =" Matriz A\n", exibirB=" Matriz B\n", exibirC=" Matriz C\n", exibir="\n\n Tabuada das Matrizes";
		
		for(int i = 0; i < matrizA.length; i++) {
			//receber os valores da matriz A
			for(int j = 0; j < matrizB.length; j++) {
				matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("[MATRIZ A]\nDigite o valor da linha " +  (i+1) + " coluna " + (j+1)));
				exibirA = exibirA + matrizA[i][j] + " "; 	
			}//j
			exibirA = exibirA + "\n";
		}//i

		for(int i = 0; i < matrizB.length; i++) {
			//receber os valores da matriz B
			for(int j = 0; j < matrizB.length; j++) {
				matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("[MATRIZ B]\nDigite o valor da linha " +  (i+1) + " coluna " + (j+1)));
				matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
				exibirB = exibirB + matrizB[i][j] + " "; 	
				exibirC = exibirC + matrizC[i][j] + " "; 	
			}//j
			exibirB = exibirB + "\n";
			exibirC = exibirC + "\n";
		}//i
		
		System.out.print(exibirA + "\n\n" + exibirB + "\n\n" + exibirC);
		
	/*	
		for(int i = 0; i < matrizC.length; i++) {
			//exibir a matriz C no formato de matriz
			for(int j = 0; j < matrizC.length; j++) {
				System.out.print(" " + matrizA[i][j] + " * "+ matrizB[i][j] + " = "+ matrizC[i][j] + " | ");
				exibir = exibir + matrizC[i][j] + " "; 			
			}//j
			System.out.print("\n");
			exibir = exibir + "\n";
		}//i
*/
	}

}
