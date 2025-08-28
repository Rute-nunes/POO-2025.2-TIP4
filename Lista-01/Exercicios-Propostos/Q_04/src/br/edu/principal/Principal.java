package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, media;
		
		System.out.print("Insira o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		n2 = sc.nextInt();
		
		media = ((n1 * 2) + (n2 * 3))/2;
		
		System.out.print("Resultado: ");
		
	}

}
