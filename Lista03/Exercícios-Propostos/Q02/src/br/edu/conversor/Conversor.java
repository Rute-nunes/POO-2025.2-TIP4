package br.edu.conversor;

public class Conversor {

	public static int Conversor_seg (int h, int m, int s) {
		int result = 0;
		
		result = (h * 3600) + (m * 60) + s;
		return result;
	}
}
