package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1,n2,soma,op;
		double raiz = 0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1-somar dois números");
        System.out.println("2-raiz quadrada de um número");
        System.out.println("escreva uma opção:");
        
        op=sc.nextInt();
        
        switch (op) {
        case 1->{
        	System.out.println("digite um valor para o primeiro número:");
        	n1=sc.nextInt();
        	System.out.println("digite um valor pro segundo número:");
        	n2=sc.nextInt();
        	soma=n1+n2;
        	System.out.println("a soma de " + n1 +  " e "  +  n2  + " é: "  +  soma);
        }
        case 2->{
        	System.out.println("digite um valor para o primeiro número:");
        	n1=sc.nextInt();
        	raiz=Math.sqrt(n1);
        	System.out.println("a raiz quadrada de "  + n1 + " é: " + raiz);
        }
        default -> {
        	System.out.println("opção inválida");
        }
        }
        

        
        
        
        
        
        
	}

}
