package aula01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        System.out.println("Insira dois números.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número.");
        double valor1 = sc.nextDouble();
        System.out.println("Insira o segundo número.");
        double valor2 = sc.nextDouble();
        sc.close();

        System.out.printf("Soma: %.2f%n", (valor1 + valor2));
        System.out.printf("Subtração: %.2f%n", (valor1 - valor2));
        System.out.printf("Multiplicação: %.2f%n", (valor1 * valor2));
        System.out.printf("Divisão: %.2f", (valor1 / valor2));
    }
}
