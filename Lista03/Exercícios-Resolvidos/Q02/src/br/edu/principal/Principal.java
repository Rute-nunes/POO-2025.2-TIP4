package br.edu.principal;

import java.util.Scanner;
import br.edu.soma.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, result;
		
		System.out.println("Insira um número: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira um número: ");
		n2 = sc.nextInt();
		
		result = Soma.Soma(n1, n2);
		
		System.out.println("Resultado da soma dos número entre " + n1 + " e " + n2 + " : " + result);
	}

}
