package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco, nov_preco;
		
		System.out.print("Insira o valor do produto: ");
		preco = sc.nextDouble();
		
		nov_preco = preco - preco * 10/100;
		
		System.out.print("Caso o valor " + preco + " Sofra um desconto de 10%, o novo valor será: " + nov_preco);
	}

}
