package aula01;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço de custo do produto.");
        double precoCusto = sc.nextDouble();
        System.out.println("Insira o percetual de acréssimo para cobrir os custos mais o lucro. (ex: 50%)");
        String percentual = sc.next();
        sc.close();

        String[] split = percentual.split("%");
        Double precoReajustado = precoCusto * (1+(Double.parseDouble(split[0])/100));

        System.out.printf("Preço reajustado R$%.2f", precoReajustado);
    }
}
