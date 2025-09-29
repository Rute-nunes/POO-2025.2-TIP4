package br.edu.principal;

import java.util.Scanner;
import br.edu.sequenciacao.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num; 
		double s;
		
		System.out.println("Escreva um número: ");
		num = sc.nextInt();
		
		s = Sequenciacao.Sequencia(num);
		
		System.out.println(s);
	}

}
