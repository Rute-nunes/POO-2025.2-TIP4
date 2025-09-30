package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		double precoInicial = 5.00;
        int ingressosIniciais = 120;
        double despesas = 200.00;
        double reducaoPreco = 0.50;
        int aumentoVendas = 26;

        double lucroMaximo = Double.NEGATIVE_INFINITY;
        double precoLucroMaximo = 0.0;
        int ingressosLucroMaximo = 0;


        System.out.printf("| %-15s | %-15s | %-15s |\n", "Preço (R$)", "Ingressos", "Lucro (R$)");


        for (double precoIngresso = precoInicial; precoIngresso >= 1.00; precoIngresso -= reducaoPreco) {
            
            int numeroReducoes = (int) Math.round((precoInicial - precoIngresso) / reducaoPreco);
            
            int ingressosVendidos = ingressosIniciais + (numeroReducoes * aumentoVendas);
            
            double receita = precoIngresso * ingressosVendidos;
            
            double lucro = receita - despesas;
            
            System.out.printf("| R$ %-12.2f | %-15d | R$ %-12.2f |\n", precoIngresso, ingressosVendidos, lucro);
            
            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoLucroMaximo = precoIngresso;
                ingressosLucroMaximo = ingressosVendidos;
            }
        }
        

        System.out.println("\n--- Resultado Final ---");
        System.out.printf("Lucro máximo esperado: R$ %.2f\n", lucroMaximo);
        System.out.printf("Preço do ingresso para o lucro máximo: R$ %.2f\n", precoLucroMaximo);
        System.out.printf("Quantidade de ingressos vendidos: %d\n", ingressosLucroMaximo);
	}

}
