package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int  n1,n2,n3,peso1,peso2,peso3,media;
		Scanner sc= new Scanner(System.in);
		System.out.println("digite n1:");
		n1=sc.nextInt();
		
		System.out.println("digite n2:");
		n2=sc.nextInt();
		
		System.out.println("digite n3:");
		n3=sc.nextInt();
		
		System.out.println("digite peso1:");
		peso1=sc.nextInt();
		
		System.out.println("digite peso2:");
		peso2=sc.nextInt();
		
		System.out.println("digite peso3:");
		peso3=sc.nextInt();
		
		media =(n1*peso1+n2*peso2+n3*peso3) / (peso1+peso2+peso3);
		System.out.print("media ponderada igual a:"+ media);

		}


}
