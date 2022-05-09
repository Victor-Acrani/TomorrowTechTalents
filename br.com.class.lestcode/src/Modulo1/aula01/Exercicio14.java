package Modulo1.aula01;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio do circulo.");
        double raio = sc.nextDouble();
        sc.close();

        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do circulo é %.2f", areaCirculo);
    }
}
