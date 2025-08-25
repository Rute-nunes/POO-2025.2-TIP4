package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
			int sal,perc,novosal,aumento;
			Scanner sc= new Scanner(System.in);
		   System.out.print("digite salario:");
		   sal=sc.nextInt();
		   System.out.print("digite percentual:");
		   perc=sc.nextInt();
		   
			aumento=sal*perc/100;
			System.out.println("aumento:"+ aumento);
			
			novosal=sal+aumento;
			System.out.println("novoasal:"+ novosal);

	}

}
