package br.edu.principal;

import java.util.Scanner;

import br.edu.somador.Somador;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int num = sc.nextInt();
		
		int result = Somador.Calcular_soma(num);
		System.out.println("O resultado da soma de todos os n�meros anteriores ao n�mero " + num + " �: " + result);
	}

}
