/*1)     Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: 
"Telefonou para a vítima?" 
"Esteve no local do crime?" 
"Mora perto da vítima?" 
"Devia para a vítima?" 
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". 
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		int resultado = 0;
		String resposta;
		Scanner leitura = new Scanner(System.in);
    System.out.println("**** Inocente, Suspeito, Cúmplice ou Assassino??? **** \nPara fazermos a analise, responda as seguintes perguntas \nassinalando S para SIM e N para NÃO: \nTelefonou para a vítima?");
		resposta = leitura.next();
		if(resposta.equals("S") || resposta.equals("s")){
			resultado++;
		}	
		
		System.out.println("Esteve no local do crime?");	
		resposta = leitura.next();
		if(resposta.equals("S") || resposta.equals("s")){
			resultado++;
		}	
		
		System.out.println("Mora perto da vítima?");	
		resposta = leitura.next();
		if(resposta.equals("S") || resposta.equals("s")){
			resultado++;
		}	
		
		System.out.println("Devia para a vítima?");	
		resposta = leitura.next();
		if(resposta.equals("S") || resposta.equals("s")){
			resultado++;
		}	
		
		System.out.println("Já trabalhou com a vítima?");
		resposta = leitura.next();
		if(resposta.equals("S") || resposta.equals("s")){
			resultado++;
		}	
		
		if(resultado < 2){
		System.out.println("Essa pessoa é inocente");	
		}
		if(resultado == 2){
			System.out.println("Essa pessoa é Suspeita");		
		}
		if(resultado == 3 || resultado == 4){
			System.out.println("Essa pessoa é Cúmplice");		
		}
		if(resultado == 5)
			System.out.println("Essa pessoa é o Assassino");		
  }
}
