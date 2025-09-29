package br.edu.conversor;

public class Conversor {
	
	public static void Conversor (int x) {
		int hora, min, seg, resto;
		
		hora = x / 3600;
		resto = x % 3600;
		min = resto / 60;
		seg = resto % 60;
		System.out.println(hora + " horas, " + min + " minutos e " + seg + " segundos!");
	}
}
