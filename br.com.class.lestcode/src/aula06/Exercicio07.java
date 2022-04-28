package aula06;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        final double PRECO_GASOLINA = 7.25;

        String[] carros = new String[5];
        double[] autonomia = new double[5];
        Scanner sc = new Scanner(System.in);
        double maiorAutonomia = 0;
        int indexMenorConsumo = 0;
        System.out.println("Cadastre 5 carros e o sua autonomia (Km/L).");

        for (int i = 0; i < carros.length; i++) {
            System.out.printf("%nDigite o modelo do %d carro: ", (i+1));
            carros[i] = sc.nextLine();
            System.out.printf("%nDigite o autonomia do %d carro: ", (i+1));
            autonomia[i] = sc.nextDouble();
            sc.nextLine();

            if (i==0){
                maiorAutonomia = autonomia[i];
                indexMenorConsumo = i;
            }
            if (autonomia[i] > maiorAutonomia){
                maiorAutonomia = autonomia[i];
                indexMenorConsumo = i;
            }
        }

        double[] litrosGastosPara1000Km = new double[5];
        for (int i = 0; i < litrosGastosPara1000Km.length; i++) {
            litrosGastosPara1000Km[i] = 1000.0/autonomia[i];
        }

        for (int i = 0; i < carros.length; i++) {
            System.out.printf("%nVeículo %d", (i+1));
            System.out.printf("%nNome: %s", carros[i]);
            System.out.printf("%nKm por litro: %.2f",autonomia[i]);
        }

        System.out.println("Relatório final");
        for (int i = 0; i < carros.length; i++) {
            System.out.printf("%n%d - %-20s - %.1f - %.1f litros - R$ %.2f",
                    (i+1), carros[i], autonomia[i], litrosGastosPara1000Km[i], litrosGastosPara1000Km[i]*PRECO_GASOLINA);
        }
        System.out.printf("%nO menor consumo é do %s", carros[indexMenorConsumo]);
    }
}
