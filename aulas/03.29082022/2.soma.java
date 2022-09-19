import java.util.Scanner;
class Main {
  public static void main(String[] args) {
//Faça um programa que solicite os números e quando for digitado 0 apresente a soma de todos os números digitados
		Scanner leitura = new Scanner(System.in);

		int x = 1, aux = 0;		
		while(x != 0){
			System.out.println("Digite um número: ");
			x = leitura.nextInt();
			aux = aux + x;
		}
		System.out.println("A soma dos números digitados eh: " + aux);
  }
}
