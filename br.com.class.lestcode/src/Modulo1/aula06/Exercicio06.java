package Modulo1.aula06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        final int AREA_LITRO = 6;
        final int LITRO_POR_LATA_MAIOR = 18;
        final double LITRO_POR_LATA_MENOR = 3.6;
        final double PRECO_LATA_MAIOR = 80;
        final double PRECO_LATA_MENOR = 25;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos metros quadrados você quer pintar?");
        double area = sc.nextDouble();

        double numeroLatasMaior = area/(AREA_LITRO*LITRO_POR_LATA_MAIOR);
        double modulusLataMaior = numeroLatasMaior % 1;
        double numeroLatasMaiorFinal = 0;
        if (modulusLataMaior > 0){
            numeroLatasMaiorFinal = numeroLatasMaior - modulusLataMaior + 1;
        }
        double precoLataMaior = numeroLatasMaiorFinal * PRECO_LATA_MAIOR;
        System.out.println("Numeros de lata de 18 litros: " + numeroLatasMaiorFinal);
        System.out.println("Valor a pagar: " + precoLataMaior);

        double numeroLatasMenor = area/(AREA_LITRO*LITRO_POR_LATA_MENOR);
        double modulusLataMenor = numeroLatasMenor % 1;
        double numeroLatasMenorFinal = 0;
        if (modulusLataMenor > 0){
            numeroLatasMenorFinal = numeroLatasMenor - modulusLataMenor + 1;
        }
        double precoLataMenor = numeroLatasMenorFinal * PRECO_LATA_MENOR;
        System.out.println("Numeros de lata de 3,6 litros: " + numeroLatasMenorFinal);
        System.out.println("Valor a pagar: " + precoLataMenor);

        sc.close();
    }
}
