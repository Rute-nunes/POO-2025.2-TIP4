package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num,r;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite um número:");
		num=sc.nextInt();
		
		r=num%2;
		
		if (r == 0) {
			System.out.println("número par");
			
		}
		else {
			System.out.println("número impar");
		}
			
		
		
		
		
		
	}

}
