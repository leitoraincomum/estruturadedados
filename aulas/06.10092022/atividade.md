1.No que diz respeito aos frameworks, plataformas e tecnologias Java, assinale V para a afirmativa verdadeira e F para a falsa.
( ) O Java EE é uma plataforma que contém um conjunto de tecnologias coordenadas que reduz significativamente o custo e a complexidade do desenvolvimento, implantação e gerenciamento de aplicações de várias camadas centradas no servidor, que oferece um conjunto de interfaces de programação de aplicações – APIs para desenvolvimento e execução de aplicações portáteis, robustas, escaláveis, confiáveis e seguras no lado do servidor. 
( ) EJB (Enterprise JavaBeans) é uma tecnologia que ajuda os desenvolvedores de software a criarem páginas web geradas dinamicamente baseadas em HTML, XML ou outros tipos de documentos. Lançada em 1999 pela Sun Microsystems, JSP é similar ao PHP, mas usa a linguagem de programação Java. 
( ) JPA (Java Persistence API) é um framework que permite aos desenvolvedores gerenciar os dados utilizando o mapeamento relacional de objetos em aplicações construídas na plataforma Java.
As afirmativas são, respectivamente, 

F-V-F
* V-F-V
F-F-V
V-V-F

2. Qual a estrutura do laço de repetição do..while. Dê um exemplo.
O do... while executa pelo menos uma vez e , só depois da primeira execução, entra no laço while para validar se a condição é verdadeira.
Estrutura: do{ comandos }(while condicao)
Exemplo: import java.util.Scanner; class Main {   public static void main(String[] args) {     //Faça um programa que implemente um menu onde o usuário deve selecionar 1 ou 0. Caso seja digitado um número diferente, o programa deverá solicitar uma nova opção. 		Scanner leitura = new Scanner(System.in); 		int escolha;   		do{ 		System.out.println("Escolha uma opção do menu \n 0 - Cadastrar" + 			"\n 1 - Consultar"); 			escolha = leitura.nextInt(); 		}while(escolha != 0 && escolha != 1);   } }

3. Qual a estrutura do ternário. Dê um exemplo.
Estrutura: condição? valor(comando se a condição é verdadeiro) : valor(comando se a condição é falsa). 
Exemplo: double desconto = conta * (conta > 99.99 ? 0.15 : 0);

4. Qual o laço de repetição que sabemos o início e o fim da repetição. Dê um exemplo
O for, pois vai ser sempre iniciado com começo, meio e fim bem definidos. Exemplo: /* 2)     Faça um programa que recebe a altura de um triangulo em um número inteiro e imprima-o utilizando asteriscos. Veja o Exemplo:   Entrada: 5   * ** *** **** *****  */  import java.util.Scanner; class Main {   public static void main(String[] args) { 		Scanner leitura = new Scanner(System.in);     System.out.println("**** Altura do Triangulo **** \nDigite a altura do triangulo que quer imprimir"); 		int altura = leitura.nextInt();  		for(int i = 1; i <= altura; i++){ 									System.out.print("\n"); 			for(int j = i; j > 0; j--){ 						System.out.print("*"); 			}		 		} 	} }

5.Faça um programa que recebe a altura de um triangulo em um número inteiro e
imprima-o utilizando asteriscos. Veja o Exemplo:

Entrada: 5

*
**
***
****
*****
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
