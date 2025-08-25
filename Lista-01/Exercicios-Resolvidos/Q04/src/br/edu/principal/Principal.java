package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int sal,novosal;
		Scanner sc=new Scanner(System.in);
		System.out.println("digite salario:");
		sal=sc.nextInt();
		
		novosal=sal+sal * 25/100;
		
		System.out.println("novo salario é:"+novosal);
		
		
		
	}

}
