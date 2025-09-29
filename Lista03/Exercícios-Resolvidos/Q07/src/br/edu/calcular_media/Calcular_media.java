package br.edu.calcular_media;

public class Calcular_media {
	
	public static double Calculadora_Media (double n1, double n2, double n3, char op) {
		double media = 0;
		if (op == 'A' || op == 'a') {
			media = (n1 + n2 + n3) / 3;
		}
		else if (op == 'P' || op == 'p') {
			media = (n1*5 + n2*3 + n3*2) / (5+3+2);
		}
		return media;
	}
}
