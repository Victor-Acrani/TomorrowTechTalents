package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor total das vendas:");
        double vendas = sc.nextDouble();
        sc.close();

        double comissao;
        if(vendas < 1500.00){
            comissao = vendas*0.03;
        } else {
            comissao = vendas*0.05;
        }

        double salarioTotal = salarioFixo + comissao;
        System.out.printf("Salário total: R$%.2f", salarioTotal);
    }
}
