package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        final double VALOR_ALCOOL = 5.20;
        final double VALOR_GASOLINA = 7.59;

        System.out.println("Qual combustível você quer comprar? Digite 'A' para álcoll e 'G' para gasolina");
        Scanner sc = new Scanner(System.in);
        String combustivel = sc.nextLine();
        System.out.println("Quantos litros você quer comprar?");
        double litros = sc.nextDouble();
        sc.close();
        double preco = 0;
        double desconto;

        if(combustivel.charAt(0) == 'A' || combustivel.charAt(0) == 'a'){

            if(litros <= 20.0){
                desconto = 3;
            } else {
                desconto = 5;
            }
            preco = litros * (VALOR_ALCOOL*((100.0-desconto)/100.0));

        } else if (combustivel.charAt(0) == 'G' || combustivel.charAt(0) == 'g'){

            if(litros <= 20.0){
                desconto = 4;
            } else {
                desconto = 6;
            }
            preco = litros * (VALOR_GASOLINA*((100.0-desconto)/100.0));

        } else {
            System.out.println("Não temos esse combustível.");
        }

        System.out.printf("%nValor a pagar: R$%.02f", preco);
    }
}
