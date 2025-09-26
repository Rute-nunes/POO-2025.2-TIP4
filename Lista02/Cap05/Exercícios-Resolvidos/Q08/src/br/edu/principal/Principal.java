package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão08 = new Scanner(System.in);

        System.out.printf("Digite o número de termos: ");
        int n = Questão08.nextInt();

        int a = 2, b = 7, c = 3;
        int i = 1;

        while (i <= n) {
            System.out.printf("%d ", a);
            i++;
            if (i > n) break;

            System.out.printf("%d ", b);
            i++;
            if (i > n) break;

            System.out.printf("%d ", c);
            i++;

            a = a * 2;
            b = b * 3;
            c = c * 4;
        }
        System.out.printf("\n");

	}

}
