package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("digite o primeiro número:");
		n1=sc.nextInt();

		System.out.println("digite o segundo número:");
		n2=sc.nextInt();
		
		if (n1>n2) {
			System.out.println("o maior é o número: " + n1);
			
		}
		else if (n2>n1) {
			System.out.println("o maior é o número:" + n2);
		}
		else if (n1==n2) {
			System.out.println("os números são iguais:");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
