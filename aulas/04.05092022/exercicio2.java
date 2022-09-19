/*
2)     Faça um programa que recebe a altura de um triangulo em um número inteiro e imprima-o utilizando asteriscos. Veja o Exemplo:
 
Entrada: 5
 
*
**
***
****
***** 
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
    System.out.println("**** Altura do Triangulo **** \nDigite a altura do triangulo que quer imprimir");
		int altura = leitura.nextInt();

		for(int i = 1; i <= altura; i++){
									System.out.print("\n");
			for(int j = i; j > 0; j--){
						System.out.print("*");
			}		
		}
	}
}
