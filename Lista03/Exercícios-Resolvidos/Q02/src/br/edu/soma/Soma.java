package br.edu.soma;

public class Soma {
	
		public static int Soma(int x, int y) {
			int result = 0;
			for (int i = x+1; i < y; i++ ) {
				result += i;
			}
			return result;
		}
		
	}


