package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			Double n1,n2,n3,media,n_exame,media_exame ;
			
			System.out.println("digite nota 1 :");
			n1=sc.nextDouble();
			
			System.out.println("digite nota 2 :");
			n2=sc.nextDouble();
			
			System.out.println("digite nota 3 :");
			n3=sc.nextDouble();
			
			media = (n1 + n2 + n3) / 3;
			
			System.out.println("Média aritmétrica:" + media);
			
			if (media >= 0 & media < 3) {
				System.out.println("Reprovado");
			}
			
			else if (media >= 3 & media < 7) {
			
				media_exame=10-media;
				System.out.println("deve tirar nota " + media_exame + " para ser aprovado");
				
				
				System.out.println("digite sua nota do exame:");
				n_exame=sc.nextDouble();
				
				if (n_exame >=6 ) {
					System.out.println("Agora foi Aprovado");
				}
				else {
					System.out.println("Reporvado no exame");
				}
			

	}

}
	
}
