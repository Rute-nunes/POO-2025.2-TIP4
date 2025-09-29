package br.edu.principal;

import java.util.Scanner;
import br.edu.calculador.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int h_inicial, min_inicial, h_final, min_final, min;
		
		System.out.printf("Insira a hora inicial: ");
		h_inicial = sc.nextInt();
		
		System.out.printf("Insira os minútos inicial: ");
		min_inicial = sc.nextInt();
		
		System.out.printf("Insira a hora final: ");
		h_final = sc.nextInt();
		
		System.out.printf("Insira a hora final: ");
		min_final = sc.nextInt();

		min = Calculador.Calculadora(h_inicial, min_inicial, h_final, min_final);
		
		System.out.println("Duração em minutos: " + min);
		
	}

}
