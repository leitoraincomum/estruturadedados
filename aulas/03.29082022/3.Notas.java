import java.util.Scanner;

class Main {
  public static void main(String[] args) {
/*Desenvolva um programa que solicite a nota de 10 alunos, sabendo que as notas acima ou igual a 6 são aprovados. Apresente:
- a maior nota
- a menor nota
- a média da sala
- quantos foram aprovados
*/
		Scanner leitura = new Scanner(System.in);

		int aprovados=0, i = 1;
		double media= 0.0, nota, maior = 0.0, menor = 10.0;
			
		while(i < 11){
			System.out.println("Digite a nota do aluno " + i + " : ");
			nota = leitura.nextInt();
			media = media + nota;
			if(nota < menor){
				menor = nota;
			}
			if(nota > maior){
				maior = nota;
			}
			if(nota >= 6){
				aprovados++;
			}
			i++;
		}
		System.out.println("\nA maior nota da sala " + maior +  
											 "\nA menor nota da sala " + menor + 
											 "\nA media da sala " + (media/10) + 
											 "\nA quantidade de aprovados: " + aprovados);
  }
}
