package aula06;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        final int AREA_LITRO = 3;
        final int LITRO_POR_LATA = 18;
        final double PRECO_LATA = 80;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos metros quadrados você quer pintar?");
        double area = sc.nextDouble();

        double numeroLatas = area/(AREA_LITRO*LITRO_POR_LATA);
        double modulus = numeroLatas % 1;
        double numeroLatasFinal = 0;

        if (modulus > 0){
            numeroLatasFinal = numeroLatas - modulus + 1;
        }

        double preco = numeroLatasFinal * PRECO_LATA;
        System.out.println("Numeros de latas: " + numeroLatasFinal);
        System.out.println("Valor a pagar: " + preco);
        sc.close();
    }
}
