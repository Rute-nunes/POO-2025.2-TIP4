package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int n1,n2,n3,media;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite n1:");
		n1=sc.nextInt();
		
		System.out.println("digite n2:");
		n2=sc.nextInt();
		
		System.out.println("digite n3:");
		n3=sc.nextInt();

        media=n1+n2+n3 / 3;
        System.out.print( "resultado é:" + media);

	}

}
