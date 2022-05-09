package Modulo1.aula01;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço de custo do carro.");
        double precoCusto = sc.nextDouble();
        System.out.println("Insira o percetual de acréssimo para cobrir os custos do distribuidor. (ex: 28%)");
        String percentualDistribuidor = sc.next();
        System.out.println("Insira o percetual de acréssimo para cobrir os impostos. (ex: 45%)");
        String percentualImposto = sc.next();
        sc.close();

        String[] splitDistribuidor = percentualDistribuidor.split("%");
        String[] splitImposto = percentualImposto.split("%");

        double precoAposDistribuidor = precoCusto * (1+(Double.parseDouble(splitDistribuidor[0])/100));
        double precoFinal = precoAposDistribuidor * (1+(Double.parseDouble(splitImposto[0])/100));

        System.out.printf("Preço final R$%.2f", precoFinal);
    }
}
