package br.edu.principal;

import java.util.Scanner;
import br.edu.calcular_media.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, media;
		char escolha;
		
		System.out.printf("Insira a primeira nota: ");
		n1 = sc.nextDouble();

		System.out.printf("Insira a segunda nota: ");
		n2 = sc.nextDouble();
		
		System.out.printf("Insira a terceira nota: ");
		n3 = sc.nextDouble();
		
		do {
            System.out.println("Digite 'A' para média aritmética ou 'P' para média ponderada:");
            escolha = sc.next().charAt(0);
        } while (escolha != 'A' && escolha != 'a' && escolha != 'P' && escolha != 'p');
		
		if (escolha != 'A' || escolha != 'P') {
			media = Calcular_media.Calculadora_Media(n1, n2, n3, escolha);
			
			System.out.printf("Media: " + media);

		}
		else {
			System.out.printf("OPÇÃO INVÁLIDA!");

		}
		
	}

}
