package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			
			System.out.println("O número " + n2 + " é o menor");
		}
		
		else {
			
			System.out.println("O número " + n1 + " é o menor");
		}
	}

}
