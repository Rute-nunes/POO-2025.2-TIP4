package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Insira a primeira nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if (media >= 7) {
			
			System.out.println("Média: " + media);
			System.out.println("Aprovado!");
			
		}
		
		else if (media >= 3 & media < 7) {
			
			System.out.println("Média: " + media);
			System.out.println("Exame!");

		}
		
		else {
			
			System.out.println("Média: " + media);
			System.out.println("Reprovado!");

		}
	}

}
