package br.edu.somador;

public class Somador {

	public static int Calcular_soma (int num) {
		int result = 0;
		
		for (int i = 0; i <= num; i++) {
			result += i;
		}
		return result;
	}
}
