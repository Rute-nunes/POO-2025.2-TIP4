package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
	}

}
