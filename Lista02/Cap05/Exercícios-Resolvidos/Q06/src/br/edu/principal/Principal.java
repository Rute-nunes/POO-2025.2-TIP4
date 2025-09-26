package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Questão06 = new Scanner(System.in);

        double salarioMin = 450.0;
        int i = 1;

        do {
            System.out.printf("Código: ");
            int cod = Questão06.nextInt();

            System.out.printf("Horas trabalhadas: ");
            int horas = Questão06.nextInt();

            System.out.printf("Turno (M/V/N): ");
            String turno = Questão06.next();

            System.out.printf("Categoria (O/G): ");
            String cat = Questão06.next();

            double valorHora;
            if (cat == "G") {
                if (turno == "N") {
                    valorHora = salarioMin * 0.18;
                } else {
                    valorHora = salarioMin * 0.15;
                }
            } else {
                if (turno == "N") {
                    valorHora = salarioMin * 0.13;
                } else {
                    valorHora = salarioMin * 0.10;
                }
            }

            double salInicial = horas * valorHora;
            double aux;

            if (salInicial < 300) {
                aux = salInicial * 0.20;
            } else if (salInicial <= 600) {
                aux = salInicial * 0.15;
            } else {
                aux = salInicial * 0.05;
            }

            double salFinal = salInicial + aux;

            System.out.printf("Código %d - Salário Final = %.2f\n", cod, salFinal);

            i++;
        } while (i <= 10);

	}

}
