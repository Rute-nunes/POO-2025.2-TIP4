package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double idade, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
		double total_a1, total_a5;
		
		for (int i = 1; i <= 8; i++) {
			System.out.println("Escreva a idade da " + i + "ª pessoa: ");
			idade = sc.nextInt();
			if (idade <= 15) {
				a1 += 1;
			}
			
			else if (idade >= 16 & idade <= 30) {
				a2 += 1;
			}
			
			else if (idade >= 31 & idade <= 45) {
				a3 += 1;
			}
			
			else if (idade >= 46 & idade <= 60) {
				a4 += 1;
			}
			
			else if (idade > 60) {
				a5 += 1;
			}
		}
		
		System.out.println("Quantidade de pessoas em cada faixa etária: ");
		System.out.println("1A: " + a1);
		System.out.println("2A: " + a2);
		System.out.println("3A: " + a3);
		System.out.println("4A: " + a4);
		System.out.println("5A: " + a5);
		
		total_a1 = (a1 / 8) * 100;
		
		total_a5 = (a5 / 8) * 100;
		
		System.out.println("Porcentágem de pessoas na primeira faixa etária: " + total_a1 + "%");
		System.out.println("Porcentágem de pessoas na ultima faixa etária: " + total_a5 + "%");
	}

}
