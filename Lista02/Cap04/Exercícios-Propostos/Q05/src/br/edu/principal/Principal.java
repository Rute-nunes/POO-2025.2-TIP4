package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, result;
		
		System.out.println("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.println("Escolha uma das opções:\n1 - Média\n2 - Diferença\n3 - Produto\n4 - Divisão");
		int escolha = sc.nextInt();
		
		switch(escolha) {
		
		case 1 -> {
			result = (n1 + n2) / 2;
			System.out.println("Média entre os números " + n1 + " e " + n2 + ": " + result);
		}
		
		case 2 -> {
			if (n1 > n2) {
				result = n1 - n2;
				System.out.println("Diferença do " + n1 + " pelo " + n2 + ": " + result);
			}
			
			else {
				result = n2 - n1;
				System.out.println("Diferença do " + n2 + " pelo " + n1 + ": " + result);
			}
		}
		
		case 3 -> {
			result = n1 * n2;
			System.out.println("Produto de " + n1 + " e " + n2 + ": " + result);
		}
		
		case 4 -> {
			result = n1 / n2;
			System.out.println("Divisão de " + n1 + " por " + n2 + ": " + result);
		}
		
		default -> {
			System.out.println("Opção Inválida!");
		}
		}
	}

}
