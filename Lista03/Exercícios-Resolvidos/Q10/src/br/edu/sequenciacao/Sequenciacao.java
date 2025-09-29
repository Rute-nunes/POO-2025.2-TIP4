package br.edu.sequenciacao;

public class Sequenciacao {

	public static double Sequencia (int num) {
		double seq = 1.0;
		
        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;

            seq += 1.0 / fatorial;
        }

        return seq;
    }
}
