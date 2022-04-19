package aula01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        double valor = sc.nextDouble();
        sc.close();

        double prestacao = valor / 5;

        System.out.printf("A compra foi dividida e 5 prestações de R$%.2f", prestacao);
    }

}
