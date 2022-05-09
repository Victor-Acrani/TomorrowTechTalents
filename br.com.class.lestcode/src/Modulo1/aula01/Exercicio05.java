package Modulo1.aula01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        System.out.println("Digite o salário do funcionário. ");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        sc.close();

        double reajuste = (double) 7/100;
        double salarioReajustado = salario * (1 + reajuste);

        System.out.printf("Salario antes do reajuste: R$%.2f%n", salario);
        System.out.printf("Salario após o reajuste: R$%.2f",salarioReajustado);
    }
}
