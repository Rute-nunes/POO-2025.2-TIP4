package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão03 = new Scanner(System.in);

        System.out.printf("Quantos números quer calcular: ");
        int n = Questão03.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Número %d: ", i);
            int num = Questão03.nextInt();

            int fat = 1;
            for (int j = 1; j <= num; j++) {
                fat = fat * j;
            }

            System.out.printf("%d! = %d\n", num, fat);
        }
	}

}
