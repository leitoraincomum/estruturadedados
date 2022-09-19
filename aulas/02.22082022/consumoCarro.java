import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		//resolver erro de entrada de dados
		Scanner scan = new Scanner(System.in);
		
		int km, combustivel, consumo;
    System.out.println("**** CALCULO DE CONSUMO DE COMBÚSTÍVEL ****");
		System.out.println("Digite a quantidade de km percorridas:");
		km = scan.nextInt();
		System.out.println("Digite a quantidade de litros de combústivel percorrida:");
		combustivel = scan.nextInt();
		consumo = combustivel/km;

		if(consumo < 8)
			{      System.out.printf("Venda o carro");}
		else if (consumo >=8 && consumo <=14)
			{System.out.printf("Econômico");}
		else if(consumo > 14)
			{System.out.printf("Super Econômico");}
  }
}
