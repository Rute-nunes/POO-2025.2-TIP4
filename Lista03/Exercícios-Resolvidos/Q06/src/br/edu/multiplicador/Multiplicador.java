package br.edu.multiplicador;

public class Multiplicador {
	
	public static void Multiplicacao (int n) {
		
		for (int i = 1; i <= n; i++) {
			
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(i * j);

                if (j < i) {
                	
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
}
}