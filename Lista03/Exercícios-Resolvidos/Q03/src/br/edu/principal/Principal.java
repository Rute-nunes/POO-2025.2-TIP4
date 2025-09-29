package br.edu.principal;

import java.util.Scanner;
import br.edu.divisao.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, result;
		
		do {
		System.out.println("Insira o primeiro n�mero (deve ser maior que 1): ");
		a = sc.nextDouble();
		} while (a <= 1);
		
		System.out.println("Insira o segundo n�mero: ");
		b = sc.nextDouble();
			
		System.out.println("Insira o terceiro n�mero: ");
		c = sc.nextDouble();
		
		result = Divisao.Divisor(a, b, c);
			
		System.out.println("Resultado: " + result);
		
	}

}
