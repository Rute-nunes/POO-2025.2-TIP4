package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
				
		Scanner Questão07 = new Scanner(System.in);
				
		System.out.println("Digite seu Salário: ");
		double Salário = Questão07.nextDouble();
				
		//Você tem 50R$ de Gratificação sobre seu Salário base
		//Você tem 10% de Imposto sobre seu Salário base
				
				
		int gratificação = 50;
		double imposto = Salário * 10/100;
		double SalárioReceber = Salário + gratificação - imposto;
				
		System.out.println("Seu Salário a receber será: " + SalárioReceber + "R$");

	}

}
