package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		System.out.println("Insira a primeira nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		n2 = sc.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		n3 = sc.nextDouble();
		
		System.out.println("Insira a quarta nota: ");
		n4 = sc.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media < 7) {
			
			System.out.println("Média: " + media);
			System.out.println("Você não passou!");
		}
		
		else {
			
			System.out.println("Média: " + media);
			System.out.println("Você passou!");
		}
	}

}
