package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner Questão04 = new Scanner(System.in);

        int maiorAcidentes = -1, menorAcidentes = 999999;
        int codigoMaior = 0, codigoMenor = 0;
        int somaVeiculos = 0;
        int somaAcidMenos2000 = 0, contMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Código da cidade: ");
            int cod = Questão04.nextInt();
            System.out.printf("Número de veículos: ");
            int veic = Questão04.nextInt();
            System.out.printf("Número de acidentes: ");
            int acid = Questão04.nextInt();

            if (acid > maiorAcidentes) {
                maiorAcidentes = acid;
                codigoMaior = cod;
            }
            if (acid < menorAcidentes) {
                menorAcidentes = acid;
                codigoMenor = cod;
            }

            somaVeiculos = somaVeiculos + veic;

            if (veic < 2000) {
                somaAcidMenos2000 = somaAcidMenos2000 + acid;
                contMenos2000++;
            }
        }

        System.out.printf("Maior índice: %d (cidade %d)\n", maiorAcidentes, codigoMaior);
        System.out.printf("Menor índice: %d (cidade %d)\n", menorAcidentes, codigoMenor);
        System.out.printf("Média de veículos = %.2f\n", somaVeiculos / 5.0);

        if (contMenos2000 > 0) {
            System.out.printf("Média de Acidentes (<2000 veículos) = %.2f\n", somaAcidMenos2000 / (double) contMenos2000);
        }

	}

}
