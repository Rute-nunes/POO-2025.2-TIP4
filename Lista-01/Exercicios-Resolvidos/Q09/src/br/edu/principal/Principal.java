package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão09 = new Scanner(System.in);
		
		System.out.println("Digite a altura do Triângulo: ");
		double Altura = Questão09.nextDouble();
		
		System.out.println("Digite a Base do Triângulo: ");
		double Base = Questão09.nextDouble();
		
		double Área = (Base * Altura)/2; 
		
		System.out.println("A Área do Triângulo será: " + Área);
	}

}
