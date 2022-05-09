package Modulo1.aula06;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        final int PESO_PERMITIDO = 50;
        final int MULTA = 4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o peso do peixe.");
        double peso = sc.nextDouble();
        sc.close();

        double multa;

        if (peso > 50.0){
            multa = (peso - PESO_PERMITIDO) * MULTA;
            System.out.println("Multa a pagar: R$" + multa);
        } else {
            System.out.println("Não tem multa.");
        }
    }
}
