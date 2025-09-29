package br.edu.principal;

import java.util.Scanner;
import br.edu.multiplicador.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.printf("Insira um número e 1 a 9: ");
		n = sc.nextInt();
		} while (n < 1 || n > 9);
		
		Multiplicador.Multiplicacao(n);
		
	}

}
