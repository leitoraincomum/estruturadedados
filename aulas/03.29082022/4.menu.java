import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Faça um programa que implemente um menu onde o usuário deve selecionar 1 ou 0. Caso seja digitado um número diferente, o programa deverá solicitar uma nova opção.
		Scanner leitura = new Scanner(System.in);
		int escolha;


		do{
		System.out.println("Escolha uma opção do menu \n 0 - Cadastrar" +
			"\n 1 - Consultar");
			escolha = leitura.nextInt();
		}while(escolha != 0 && escolha != 1);
  }
}
