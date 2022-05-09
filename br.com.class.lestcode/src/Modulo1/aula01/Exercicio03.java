package Modulo1.aula01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();
        System.out.println("Insira o numero de mêses para o pagamento do emprestimo: ");
        double meses = sc.nextDouble();
        sc.close();

        double juros = 2;
        double valorFinal = emprestimo* Math.pow((1+(juros/100)), meses);

        System.out.printf("Você pagará R$%.2f pelo emprestimo.", valorFinal);
    }

}
