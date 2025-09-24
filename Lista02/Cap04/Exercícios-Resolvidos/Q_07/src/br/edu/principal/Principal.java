package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		int I;
		
		System.out.println("digite um  número:");
		a=sc.nextDouble();
		
		System.out.println("digite um número:");
		b=sc.nextDouble();
		
		System.out.println("digite um número:");
		c=sc.nextDouble();
		
		System.out.println("digite um número (1,2 ou 3):");
		I=sc.nextInt();
		
		switch (I) {
		case 1 -> { 
		        if(a<b & a<c) {
				if (b<c) {
					System.out.println("a ordem crescente é : " +  a  + " - " + b + " - " + c);
				}
				else {
					System.out.println("a ordem crescente é : " +  a  + " - " + c + " - " + b);
				}
			}
			else if (b < a & b < c) {
				if (a<c) {
					System.out.println("a ordem crescente é : "+  b  + " - "  +  a  +  " - " + c);
				}
				else { 
					System.out.println("a ordem crescente é :"+ b + " - "  + c + " - " + a);
				}
			}
			
			else if (c<a & c<b) {
				if (a<b) {
					System.out.println("a ordem crescente é :"+ c + " - " + a + " - " + b);
				}
				else {
					System.out.println("a ordem crescente é :"+ c + " - " + b + " - " + a);
				}
			}
		}
		
		case 2 ->{
			if(a>b & a>c) {
				if (b>c) {
					System.out.println("a ordem decrescente é : " +  a  + " - " + b + " - " + c);
				}
				else {
					System.out.println("a ordem decrescente é : " +  a  + " - " + c + " - " + b);
				}
			}
			else if (b > a & b > c) {
				if (a>c) {
					System.out.println("a ordem decrescente é : "+  b  + " - "  +  a  +  " - " + c);
				}
				else { 
					System.out.println("a ordem decrescente é :"+ b + " - "  + c + " - " + a);
				}
			}
			
			else if (c>a & c>b) {
				if (a>b) {
					System.out.println("a ordem decrescente é :"+ c + " - " + a + " - " + b);
				}
				else {
					System.out.println("a ordem decrescente é :"+ c + " - " + b + " - " + a);
				}
			}
		}
		case 3 ->{
			if(a>b & a>c) {
					System.out.println("a ordem desejada é : " +  b  + " - " + a + " - " + c);
			}
		
			else if (b > a & b > c) {
					System.out.println("a ordem desejada é : "+  a  + " - "  +  b  +  " - " + c);
				}
	
			
			
			else if (c>a & c>b) {
				
					System.out.println("a ordem decrescente é :"+ a + " - " + c + " - " + b);
				}
		}
			
		default -> {
			System.out.println("opção inválida");
		}
		}
		
		
		
		
		
		
		

	}

}
