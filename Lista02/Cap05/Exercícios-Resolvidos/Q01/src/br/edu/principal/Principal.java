package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, ano_atual, sal_novo, percentual;
		
		sal = 1000;
		percentual = 0.025/100;
		ano_atual = 2025;
		
		sal_novo = sal + (sal * percentual);
		
		for(int i = 2006; i < 2026; i++) {
			System.out.printf("Ano: %d - Aumento de %.6f%n -" + "Salário: R$ %.2f%n", i, percentual, sal_novo);
			
			percentual *= 2;
			System.out.printf("Novo Percentual: %.6f%n", percentual);
			sal_novo = sal_novo + (sal_novo * percentual);
			System.out.printf("Salário Novo: R$ %.2f%n", sal_novo);
		}

	}

}
