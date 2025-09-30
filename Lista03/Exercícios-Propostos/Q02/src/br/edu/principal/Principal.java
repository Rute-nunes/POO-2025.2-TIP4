package br.edu.principal;

import java.util.Scanner;

import br.edu.conversor.Conversor;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora, min, seg, result;
		
		System.out.println("Insira as horas: ");
		hora = sc.nextInt();
		
		System.out.println("Insira os minutos: ");
		min = sc.nextInt();
		
		System.out.println("Insira os segundos: ");
		seg = sc.nextInt();
		
		result = Conversor.Conversor_seg(hora, min, seg);
		System.out.println("O horário escolhido em segundos é: " + result);
		
	}

}
