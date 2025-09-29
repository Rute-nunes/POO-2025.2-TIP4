package br.edu.verificacao;

public class Verificacao {
	
	static int result;
	
	public static int Verificador(int x) {
		if (x >= 0) {
			result = 1;
		}
		else {
			result = 0;
		}
		return result;
	}
	
	
	
}
