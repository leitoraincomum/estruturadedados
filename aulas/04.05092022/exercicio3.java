/*
3)     Uma firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado no mercado. Para isso forneceu o sexo do entrevistado e sua resposta (S – Sim ou N – Não). Sabe-se que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre: 
O número de pessoas que respondeu sim; 
O número de pessoas que respondeu não; 
O número de mulheres que respondeu sim; 
A percentagem de homens que respondeu “não” entre todos os homens analisados.     

*/
import java.util.Scanner;
class Main {

  public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
    System.out.print("**** Pesquisa de mercado ****");
		int sim=0, nao=0, hnao=0, msim=0, pnao=0,qtdeh=0, psim=0;
		String sexo, resposta;
		
		for(int i = 1; i <= 10; i++){
			System.out.print("Digite o sexo do entrevistado: \n(h - homem e m - mulher): ");
			sexo = leitura.next();
			if(sexo.equals("h") || sexo.equals("H")){
				//eh homem
				qtdeh++;
				System.out.print("A resposta do entrevistado eh \nS - sim ou N - não? ");
				resposta = leitura.next();
				if(resposta.equals("N") || resposta.equals("n")){
					hnao++;
					pnao++;
				}else{
					psim++;
				}
			}
		if(sexo.equals("m") || sexo.equals("M")){
				//eh mulher
				System.out.print("A resposta do entrevistado eh \nS - sim ou N - não? ");
				resposta = leitura.next();
				if(resposta.equals("S") || resposta.equals("s")){
					msim++;
					psim++;
				}else{
					pnao++;
				}
			}			
		}
		System.out.println("A quantidade de pessoas que respondeu sim: " + sim + "\nA quantidade de pessoas que respondeu não: " + nao + "\nA quantidade de mulheres que respondeu sim: " + msim + "\nA percentagem de homens que respondeu não entre os homens analisados eh: " + ((hnao*1)/qtdeh));

		
		
  }
}
