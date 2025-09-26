package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
        System.out.printf("%d %d ", num1, num2);

        for (int i = 3; i <= 8; i++) {
            int res = num1 + num2;
            System.out.printf("%d ", res);
            num1 = num2;
            num2 = res;
        }
        System.out.printf("\n");

	}

}
