package br.edu.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays; 	
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        List<Double[]> grupos = new ArrayList<>();

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Grupo " + (i + 1) + " : ");
	            System.out.print("Digite o valor de A: ");
	            double a = scanner.nextDouble();
	            System.out.print("Digite o valor de B: ");
	            double b = scanner.nextDouble();
	            System.out.print("Digite o valor de C: ");
	            double c = scanner.nextDouble();
	            System.out.print("Digite o valor de D: ");
	            double d = scanner.nextDouble();

	            grupos.add(new Double[]{a, b, c, d});
	        }

	        scanner.close();

	        System.out.println("\nGrupos na ordem de leitura");
	        for (int i = 0; i < grupos.size(); i++) {
	            System.out.println("Grupo " + (i + 1) + ": " + Arrays.toString(grupos.get(i)));
	        }

	        List<Double[]> gruposCrescente = new ArrayList<>(grupos);
	        Collections.sort(gruposCrescente, new Comparator<Double[]>() {
	            public int compare(Double[] grupo1, Double[] grupo2) {
	                for (int i = 0; i < grupo1.length; i++) {
	                    int comparacao = grupo1[i].compareTo(grupo2[i]);
	                    if (comparacao != 0) {
	                        return comparacao;
	                    }
	                }
	                return 0;
	            }
	        });

	        System.out.println("\nGrupos em ordem crescente");
	        for (Double[] grupo : gruposCrescente) {
	            System.out.println(Arrays.toString(grupo));
	        }

	        List<Double[]> gruposDecrescente = new ArrayList<>(grupos);
	        Collections.sort(gruposDecrescente, new Comparator<Double[]>() {
	            public int compare(Double[] grupo1, Double[] grupo2) {
	                for (int i = 0; i < grupo1.length; i++) {
	                    int comparacao = grupo2[i].compareTo(grupo1[i]);
	                    if (comparacao != 0) {
	                        return comparacao;
	                    }
	                }
	                return 0;
	            }
	        });

	        System.out.println("\nGrupos em ordem decrescente");
	        for (Double[] grupo : gruposDecrescente) {
	            System.out.println(Arrays.toString(grupo));
	        }
    }
}
