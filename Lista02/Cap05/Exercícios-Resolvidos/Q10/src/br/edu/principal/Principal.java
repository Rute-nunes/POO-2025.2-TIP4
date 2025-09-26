package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão10 = new Scanner(System.in);

        int menores18 = 0;
        int totalJogadores = 0;
        double somaAlturas = 0.0;
        int mais80kg = 0;

        for (int t = 1; t <= 5; t++) {
            int somaIdades = 0;

            for (int j = 1; j <= 11; j++) {
                System.out.printf("Time %d - Jogador %d (idade, peso, altura): ", t, j);
                int idade = Questão10.nextInt();
                double peso = Questão10.nextDouble();
                double altura = Questão10.nextDouble();

                if (idade < 18) {
                    menores18++;
                }
                if (peso > 80) {
                    mais80kg++;
                }
                somaIdades = somaIdades + idade;
                somaAlturas = somaAlturas + altura;
                totalJogadores++;
            }
            System.out.printf("Média de idades do time %d = %.2f\n", t, somaIdades / 11.0);
        }

        System.out.printf("Média de altura = %.2f\n", somaAlturas / totalJogadores);
        System.out.printf("Jogadores > 80kg = %d\n", mais80kg);
        System.out.printf("Jogadores < 18 anos = %d\n", menores18);

	}

}
