package br.edu.principal;

import java.util.Scanner;

import br.edu.verificacao.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, result;
		
		System.out.println("Insira um n�mero: ");
		num = sc.nextInt();
		result = Verificacao.Verificador(num);
		
		if (result == 1) {
			System.out.println("N�mero positivo!");
		}
		else {
			System.out.println("N�mero negativo!");
		}
	}

}
