package br.edu.divisao;

public class Divisao {
	
	public static double Divisor(double a, double b, double c) {
		double result, resto;
		result = 0;
		for (double i = b; i <= c; i++) {
			resto = (i % a);
			if (resto == 0) {
				result += i;
			}
		}
		return result;
	}
}
