package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.print("Escreva o segundo valor: ");
		int n2 = sc.nextInt();
		
		System.out.print("Resultado:" + (n1 - n2));
	}

}