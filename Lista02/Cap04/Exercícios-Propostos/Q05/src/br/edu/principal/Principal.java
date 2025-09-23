package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, result;
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		n2 = sc.nextInt();
		
		System.out.println("Escolha uma das op��es:\n1 - M�dia\n2 - Diferen�a\n3 - Produto\n4 - Divis�o");
		int escolha = sc.nextInt();
		
		switch(escolha) {
		
		case 1 -> {
			result = (n1 + n2) / 2;
			System.out.println("M�dia entre os n�meros " + n1 + " e " + n2 + ": " + result);
		}
		
		case 2 -> {
			if (n1 > n2) {
				result = n1 - n2;
				System.out.println("Diferen�a do " + n1 + " pelo " + n2 + ": " + result);
			}
			
			else {
				result = n2 - n1;
				System.out.println("Diferen�a do " + n2 + " pelo " + n1 + ": " + result);
			}
		}
		
		case 3 -> {
			result = n1 * n2;
			System.out.println("Produto de " + n1 + " e " + n2 + ": " + result);
		}
		
		case 4 -> {
			result = n1 / n2;
			System.out.println("Divis�o de " + n1 + " por " + n2 + ": " + result);
		}
		
		default -> {
			System.out.println("Op��o Inv�lida!");
		}
		}
	}

}
