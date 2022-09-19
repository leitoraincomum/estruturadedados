package salario;

import javax.swing.JOptionPane;

public class programa {
	public static void main(String[] args) {
		/*
		Faça um programa que recebe um conjunto de salários, sendo que para terminar a
		entrada será fornecido o valor -1. Após toda a entrada ter sido realizada, leia o valor do reajuste.
		Em seguida apresente todos os salários reajustados.
		*/
		double[]salariosDigitados = new double[200];
		double[]salariosReajustados = new double[200];
		double reajuste;
		double controle = 0;
		
		for(int i=0; i < salariosDigitados.length; i++ ) {
			salariosDigitados[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um salário"));
			//controle = Double.parseDouble(JOptionPane.showInputDialog("Deseja digitar mais um salário? \nPara parar, digie -1"));
			if(salariosDigitados[i] < 0) {
				controle = i;
				break; //interrompe o loop
			}
		}
		
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do reajuste"));
		System.out.println("Valor do reajuste eh " + reajuste);
		
		if (controle > 0) {
		for(int i = 0; i <= controle; i++) {
			salariosReajustados[i] = salariosDigitados[i] + reajuste;
			System.out.println("Salario:  " + (i+1) + " eh "+ salariosDigitados[i] + 
					" / Salario Reajustado: " + salariosReajustados[i] );
		}
	}
	}

}
