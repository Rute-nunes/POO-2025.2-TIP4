package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão10 = new Scanner(System.in);
		
		System.out.println("Digite o Raio de um circulo: ");
		double Raio = Questão10.nextDouble();
		
		double RaioQuadrado = Math.pow(Raio, 2);
		
		double Área = 3.14 * RaioQuadrado; 
		
		System.out.println("A Área do Circulo será: " + Área);

	}

}
