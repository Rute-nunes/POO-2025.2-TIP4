package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner Questão06 = new Scanner(System.in);
		
		System.out.println("Digite seu Salário: ");
		double Salário = Questão06.nextDouble();
		
		//Você tem 5% de Gratificação sobre seu Salário base
		//Você tem 7% de Imposto sobre seu Salário base
		
		
		double gratificação = Salário * 5/100;
		double imposto = Salário * 7/100;
		double SalárioReceber = Salário + gratificação - imposto;
		
		System.out.println("Seu Salário a receber será: " + SalárioReceber + "R$");

	}

}
