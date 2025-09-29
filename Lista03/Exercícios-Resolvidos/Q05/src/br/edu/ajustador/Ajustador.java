package br.edu.ajustador;

public class Ajustador {
	
	public static double Calculo_reajuste (double pa, double pn) {
		double result = (100 * pn - 100 * pa) / pa;
		return result;
	}
}
