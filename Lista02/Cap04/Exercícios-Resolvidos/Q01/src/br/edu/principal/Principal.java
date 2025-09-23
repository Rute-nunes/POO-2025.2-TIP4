package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	double  trab_lab, av_sem, exame_f,media;
		
	Scanner sc= new Scanner(System.in);
	System.out.println("digite a nota do exame final:");
	exame_f= sc.nextDouble();
	
	
	System.out.println("digite a nota da avaliação semestral:");
	av_sem= sc.nextDouble();
	
	
	System.out.println("digite a nota do trabalho no laboratório:");
	trab_lab= sc.nextDouble();
	
	
	
	media=(trab_lab *2 + av_sem *3 + exame_f*5 )/10;
	System.out.println("média final =" + media);
	
	if (media >= 9) {
	System.out.println("Conceito A");	
		
	}
	else if (media < 8 & media >=7) {
	System.out.println("Conceito B");
	}
	
	else if (media < 7 & media >=6) {
		System.out.println("Conceito C");
	}
	else if (media < 6 & media >=5) {
		System.out.println("Conceito D");
	}
	else if (media < 5 & media >=3) {
		System.out.println("Conceito E");
	}
	else {
		System.out.println("Conceito F");
	}
		
		
		
		
		
		
		
		

	}

}
