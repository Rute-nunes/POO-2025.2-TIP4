package br.edu.principal;

import java.util.Scanner;

import br.edu.verificador.Verificador;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		Verificador.Verificar_positivo_negativo(num);
	}

}
