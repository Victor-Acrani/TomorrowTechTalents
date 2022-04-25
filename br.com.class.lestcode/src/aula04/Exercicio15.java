package aula04;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        System.out.println("Quantas mercadorias você quer cadastrar?");
        Scanner sc = new Scanner(System.in);
        int produtos = sc.nextInt();
        sc.nextLine();
        String[][] matriz = new String[produtos][3];

        for(int i = 0; i < produtos; i++){
            System.out.printf("%nDigite o nome do %d produto.",i+1);
            matriz[i][0] = sc.nextLine();
            System.out.printf("%nDigite a quantidade do %d produto em estoque.",i+1);
            matriz[i][1] = sc.nextLine();
            System.out.printf("%nDigite o valor unitário do %d produto.",i+1);
            matriz[i][2] = sc.nextLine();
        }

        double itensEmEstoque = 0;
        double valorTotal = 0;
        double valorMedio;

        for(int i = 0; i < produtos; i++){
            itensEmEstoque += Double.parseDouble(matriz[i][1]);
            valorTotal += (Double.parseDouble(matriz[i][1])*Double.parseDouble(matriz[i][2]));
        }
        valorMedio = valorTotal/itensEmEstoque;
        System.out.printf("%nValor total em mercadorias: R$%.2f",valorTotal);
        System.out.printf("%nValor medio em mercadorias: R$%.2f",valorMedio);
    }
}
