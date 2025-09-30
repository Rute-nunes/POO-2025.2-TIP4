package br.edu.principal;

import java.util.Scanner;

import br.edu.calculovol.CalculoVol;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o valor do raio: ");
		double raio = sc.nextDouble();
		
		CalculoVol.Calvulo_volume(raio);
	}

}
