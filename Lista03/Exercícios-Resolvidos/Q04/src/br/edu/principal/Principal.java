package br.edu.principal;

import java.util.Scanner;
import br.edu.conversor.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor em segndos: ");
		int seg = sc.nextInt();
		Conversor.Conversor(seg);
	}

}
