package br.edu.principal;

import java.util.Scanner;
import br.edu.ajustador.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precoantigo, precoatual, acrescimo;
		
		System.out.println("Insira o preço antigo do produto: ");
		precoantigo = sc.nextDouble();
		
		System.out.println("Insira o preço atual do produto: ");
		precoatual = sc.nextDouble();
		
		acrescimo = Ajustador.Calculo_reajuste(precoantigo, precoatual);
		
		System.out.println("O acrescido é: " + acrescimo);
		
	}

}
