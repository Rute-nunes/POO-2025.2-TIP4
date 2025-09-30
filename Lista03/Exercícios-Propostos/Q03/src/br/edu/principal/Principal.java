package br.edu.principal;

import java.util.Scanner;

import br.edu.divisor.Divisor;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, result;
		
		System.out.println("Insira o primeiro número: ");
		n1 = sc.nextInt();

		System.out.println("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		result = Divisor.Encontrar_divisor(n1, n2);
		
		System.out.println(result);

	}

}
