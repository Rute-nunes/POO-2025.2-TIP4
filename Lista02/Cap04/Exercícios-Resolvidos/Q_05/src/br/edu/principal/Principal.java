package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,n4;
		
		System.out.println("digite três números em ordem crescente:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		
		System.out.println("digite um número (fora de ordem):");
		n4=sc.nextInt();
		
		if (n4>n3) {
		 System.out.println("a ordem descrecente é:" +  n4  + " - " + n3 + " - " + n2 + " - " + n1);
		 
		}
		
		else if (n4 > n2 & n4 < n3) {
		System.out.println("A ordem decrescente é:" +  n3  + " - " + n4 + " - " + n2 + " - " + n1);
		}
		else if (n4>n1 & n4 <n2) {
		System.out.println("A ordem descrescente é:" +  n3  + " - " + n2 + " - " + n4 + " - " + n1);
		}
		else if (n4<n1)  {
		System.out.println("A ordem descrescente é:" +  n3  + " - " + n2 + " - " + n1 + " - " + n4);
		}
	
	}

}
