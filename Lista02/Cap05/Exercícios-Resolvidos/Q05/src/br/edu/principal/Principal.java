package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questao05 = new Scanner(System.in);

        System.out.printf("Digite o número de termos: ");
        int n = Questao05.nextInt();
        System.out.printf("Digite o valor de X: ");
        double x = Questao05.nextDouble();

        double soma = 0.0;
        int pos = 0;
        int denom = 1;

        for (int i = 0; i < n; i++) {
            double termo = Math.pow(x, i + 2) / denom;

            if (i % 2 == 0) {
                soma = soma - termo;
            } else {
                soma = soma + termo;
            }

            if (pos == 0) denom = 2;
            else if (pos == 1) denom = 3;
            else if (pos == 2) denom = 4;
            else if (pos == 3) denom = 3;
            else if (pos == 4) denom = 2;
            else if (pos == 5) denom = 1;

            pos++;
            if (pos == 6) {
                pos = 0;
            }
        }

        System.out.printf("S = %.4f\n", soma);

	}

}
