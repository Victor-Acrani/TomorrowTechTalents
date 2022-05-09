package Modulo1.aula02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        final double CONSUMO_POR_LITRO = 12.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantas horas foram gastas na viagem.");
        double tempo = sc.nextDouble();
        System.out.println("Insira a velocidade média da viagem.");
        double velocidadeMedia = sc.nextDouble();
        sc.close();

        double distancia = tempo * velocidadeMedia;
        double litros = distancia / CONSUMO_POR_LITRO;

        System.out.printf("Foram gastos %.2f litros", litros);
    }
}
