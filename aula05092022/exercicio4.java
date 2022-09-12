/*4)     A granja do Sr. Sato Yroshi possui uma determina quantia de frangos, que possuem um identificador numérico de 1 a n cada frango. Quando o identificador for igual a zero apresente: 
A quantidade total de frangos  
Apresente o frango mais gordinho e o magrinho 
A média do peso dos frangos 
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
    System.out.println("**** Granja do Sr. Sato Yroshi ****");
		int qtdTotal=0, media=0, contador=0, idControle, idGordo=0, idMagro=0;
		double peso, gordo=0.0, magro=50.0, pesoTotal=0.0;
	System.out.println();
	System.out.println("Digite o identificador do frango: ");
		idControle = leitura.nextInt();
		
		if(idControle != 0){
			while(idControle != 0){
				qtdTotal++;
				//System.out.println(id);
				System.out.println("Digite o peso do frango: ");
				peso = leitura.nextDouble();
				if(peso > gordo){
					gordo = peso;
					idGordo = idControle;
				}
				if(peso < magro){
					magro = peso;
					idMagro = idControle;
				}
				pesoTotal = pesoTotal + peso;
				System.out.println("Digite o identificador do próximo frango: ");
				idControle = leitura.nextInt();
			}
		}
		
		System.out.println("A quantidade total de frangos eh: " + qtdTotal + "\nO frango mais gordinho eh: " + idGordo + " pesando: " + gordo + "\nO frango mais magrinho eh: " + idMagro + " pesando: " + magro + "\nA media do peso dos frangos eh " + (pesoTotal/qtdTotal));	
		
  }
}
