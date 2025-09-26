package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão09 = new Scanner(System.in);

        int aprovados = 0, exames = 0, reprovados = 0;
        double somaClasse = 0.0;

        for (int i = 1; i <= 6; i++) {
            System.out.printf("Nota 1 do aluno %d: ", i);
            double n1 = Questão09.nextDouble();
            System.out.printf("Nota 2 do aluno %d: ", i);
            double n2 = Questão09.nextDouble();

            double media = (n1 + n2) / 2.0;
            somaClasse = somaClasse + media;

            if (media <= 3.0) {
                System.out.printf("Aluno %d: Reprovado\n", i);
                reprovados++;
            } else if (media < 7.0) {
                System.out.printf("Aluno %d: Exame\n", i);
                exames++;
            } else {
                System.out.printf("Aluno %d: Aprovado\n", i);
                aprovados++;
            }
        }

        System.out.printf("Total aprovados: %d\n", aprovados);
        System.out.printf("Total exames: %d\n", exames);
        System.out.printf("Total reprovados: %d\n", reprovados);
        System.out.printf("Média da classe = %.2f\n", somaClasse / 6.0);

	}

}
