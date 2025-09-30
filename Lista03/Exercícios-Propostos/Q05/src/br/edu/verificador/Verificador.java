package br.edu.verificador;

public class Verificador {

	public static void Verificar_positivo_negativo (int n) {
		String result;
		
		if (n < 0) {
			result = "negativo";
		}
		else {
			result = "positivo";
		}
		System.out.println("Este número é: " + result);
	}
}
