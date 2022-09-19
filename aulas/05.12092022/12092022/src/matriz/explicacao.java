package matriz;
import javax.swing.*;

public class explicacao {
	/*tipo [][] nomeMatriz = new tipo [2][3];
	 * 2 linhas com 3 colunas
	 * 
	 * int [] [] mat = new int [2][3]
	 * colocar valor em local específica, acessando diretamente 
	 * mat [1][2] = 15; */
	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		/*
		 * matriz[0][0] = 1; matriz[0][1] = 2; matriz[0][2] = 3;
		 * matriz[1][0] = 4; matriz[1][1] = 5; matriz[1][2] = 6;
		 */
		int soma = 0;
		String exibir = "";
		
		/*
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
				soma+= matriz[i][j];
			}//j
		}//i
		*/
		
		for(int i = 0; i < 2; i++) {
			//receber os valores
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha " +  (i+1) + " coluna " + (j+1)));
				soma+= matriz[i][j];
			}//j
		}//i

		for(int i = 0; i < 2; i++) {
			//exibir a matriz no formato de matriz
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
				exibir = matriz[i][j] + " "; 			
			}//j
			System.out.print("\n");
			exibir = exibir + "\n";
		}//i
		
				
		JOptionPane.showMessageDialog(null, "Soma dos elementos da matriz: " + soma);
		System.exit(0);
	}
}
