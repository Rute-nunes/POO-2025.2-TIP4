package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner Questão08 = new Scanner(System.in);
		
		System.out.println("Digite o valor do Depósito: ");
		double Depósito = Questão08.nextDouble();
		
		System.out.println("Digite o valor da Taxa: ");
		double Taxa = Questão08.nextDouble();

		double Rendimento = Depósito * Taxa/100;
		double Total = Depósito + Rendimento;
		
		System.out.println("Valor do Rendimento: " + Rendimento);
		System.out.println("Valor total depois do Rendimento: " + Total);
	}

}
