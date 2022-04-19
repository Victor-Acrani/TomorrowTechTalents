package aula01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        System.out.println("Digite o valor em Reais: ");
        Scanner sc = new Scanner(System.in);
        double reais = sc.nextDouble();
        sc.close();

        double dolar = reais * 4.70;
        double euro = reais * 5.11;
        double libra = reais * 6.12;

        System.out.printf("Valor convertido em Dolar: %.2f%n", dolar);
        System.out.printf("Valor convertido em Euro: %.2f%n", euro);
        System.out.printf("Valor convertido em Libra: %.2f", libra);
    }
}
