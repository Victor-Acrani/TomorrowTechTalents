package Modulo1.aula01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        System.out.println("Digite a temperatura em °C: ");
        Scanner sc = new Scanner(System.in);
        double temperaturaCelsius = sc.nextDouble();
        sc.close();

        double kelvin = temperaturaCelsius + 273.15;
        double fahrenheit = (temperaturaCelsius * 1.8) + 32;
        double rankine = (temperaturaCelsius * 1.8) + 32 + 459.67;
        double reaumur = temperaturaCelsius * 0.8;

        System.out.printf("Temperatura em graus Kelvin:%.2f%n", kelvin);
        System.out.printf("Temperatura em graus Fahrenheit:%.2f%n", fahrenheit);
        System.out.printf("Temperatura em graus Rankine:%.2f%n", rankine);
        System.out.printf("Temperatura em graus Réaumur:%.2f%n", reaumur);
    }
}
