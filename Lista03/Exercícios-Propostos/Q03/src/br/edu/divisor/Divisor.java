package br.edu.divisor;

public class Divisor {
	
	public static int Encontrar_divisor (int n1, int n2) {
		int result = -1, proxdivisor = n2;
		
		if (n1 % n2 == 0) {
			result = 0;
		}
		else {
			while (proxdivisor <= n1) {
				if (n1 % proxdivisor == 0) {
					return proxdivisor;
				}
				
				proxdivisor++;
			}
		}
		
		return result;
	}
}
