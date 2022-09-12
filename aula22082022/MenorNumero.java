import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		System.out.println("Digite três números inteiros:");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			int menor;

		if (num1 < num2 && num1 < num3)
			menor = num1;
		if (num2 < num1 && num2 < num3)
			menor = num2;
		if (num3 < num1 && num3 < num2)
			menor = num3;
		
/* exemplo de simplificação
condição? valor(comando se a condição é verdadeiro) : valor(comando se a condição é falsa)
double desconto = conta * (conta > 99.99 ? 0.15 : 0);*/

		
  }
}
