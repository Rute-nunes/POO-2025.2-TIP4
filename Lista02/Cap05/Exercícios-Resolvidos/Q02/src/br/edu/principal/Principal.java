package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Questão02 = new Scanner(System.in);

        System.out.println("Formula: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!");
        System.out.printf("Digite N: ");
        int n = Questão02.nextInt();

        double e = 1.0;
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
            e = e + 1.0 / fat;
        }

        System.out.printf("E = %.5f\n", e);
    }
}
