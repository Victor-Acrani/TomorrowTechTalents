package aula01;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do depósito: ");
        double valor = sc.nextDouble();
        sc.close();

        double rendimento = 0.7/100.0;
        double valorReajustado = valor * (1+rendimento);

        System.out.printf("O valor após um mês de investimento é R$%.2f", valorReajustado);

    }
}
