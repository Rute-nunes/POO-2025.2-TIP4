package br.edu.determinador;

import java.util.Scanner;
public class Determinador {
	
	public static void Determinador_maior_menor () {
		int num, maior, menor;
		Scanner sc = new Scanner(System.in);
		
		maior = 0;
		menor = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + "� n�mero: ");
			num = sc.nextInt();
			
			if (i == 1) {
				maior = num;
				menor = num;
			}
			
			else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
		}
		System.out.println("O maior n�mero digitado foi: " + maior);
		System.out.println("O menor n�mero digitado foi: " + menor);
	}
}