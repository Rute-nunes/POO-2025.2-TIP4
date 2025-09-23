package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("digite o primeiro número:");
		n1=sc.nextInt();
		
		System.out.println("digite o segundo número:");
		n2=sc.nextInt();
		
		System.out.println("digite o terceiro número:");
		n3=sc.nextInt();
		
		if(n1<n2 & n1<n3) {
			if (n2<n3) {
				System.out.println("a ordem crescente é : " +  n1  + " - " + n2 + " - " + n3);
			}
			else {
				System.out.println("a ordem crescente é : " +  n1  + " - " + n3 + " - " + n2);
			}
		}
		else if (n2 < n1 & n2 < n3) {
			if (n2<n3) {
				System.out.println("a ordem crescente é : "+  n2  + " - "  +  n1  +  " - " + n3);
			}
			else { 
				System.out.println("a ordem crescente é :"+ n2 + " - "  + n3 + " - " + n1);
			}
		}
		
		else if (n3<n1 & n3<n2) {
			if (n1<n2) {
				System.out.println("a ordem crescente é :"+ n3 + " - " + n1 + " - " + n2);
			}
			else {
				System.out.println("a ordem crescente é :"+ n3 + " - " + n2 + " - " + n1);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		

	


