package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			
			System.out.println("O n�mero " + n2 + " � o menor");
		}
		
		else {
			
			System.out.println("O n�mero " + n1 + " � o menor");
		}
	}

}
