package Modulo1.aula05;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        final double TAXA_SINDUCATO = 0.03;
        final double VALOR_FGTS = 0.11;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora de trabalho.");
        double valorHora = sc.nextDouble();
        System.out.println("Digite o número de horas trabalhadas");
        double horasTrabalhadas = sc.nextDouble();
        sc.close();

        double salarioBruto = valorHora * horasTrabalhadas;
        double valorSindicato = salarioBruto * TAXA_SINDUCATO;
        double valorFgts = salarioBruto * VALOR_FGTS;
        double taxaIR = 0;

        if(salarioBruto > 900.0 && salarioBruto <= 1500.0 ){
            taxaIR = 0.05;
        } else if (salarioBruto > 1500.0 && salarioBruto <= 2500.0){
            taxaIR = 0.1;
        } else if (salarioBruto > 2500.0){
            taxaIR = 0.2;
        }

        double valorIR = salarioBruto * taxaIR;
        double salarioLiquido = salarioBruto - valorSindicato - valorIR;

        System.out.printf("%nSalario bruto: R$%.2f", salarioBruto);
        System.out.printf("%nSalario liquido: R$%.2f", salarioLiquido);
        System.out.printf("%nTaxa do sindicato: R$%.2f", valorSindicato);
        System.out.printf("%nImposto de renda: R$%.2f", valorIR);
        System.out.printf("%nValor FGTS: R$%.2f", valorFgts);
    }
}
