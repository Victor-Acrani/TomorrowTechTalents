package aula02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomePraias = new String[5];
        double[] distancias = new double[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Insira o nome da " + (i+1) +"° praia");
            nomePraias[i] = sc.nextLine();
            System.out.println("Insira a distancia da " + (i+1) +"° praia");
            distancias[i] = sc.nextDouble();
            sc.nextLine();
        }
        sc.close();

        double maiorDistancia = -1;
        int indexMaiorDistancia = 0;
        int contadorDistanciaEntre10E15Km = 0;
        double distanciaTotal = 0;
        double distanciaMedia;

        for(int i = 0; i < 5; i++) {

            if(distancias[i] > maiorDistancia) {
                maiorDistancia = distancias[i];
                indexMaiorDistancia = i;
            }

            if(distancias[i] > 10.0 && distancias[i] < 15.0) {
                contadorDistanciaEntre10E15Km++;
            }

            distanciaTotal += distancias[i];
        }

        distanciaMedia = distanciaTotal / 5;

        System.out.println("A praia mais distante é: " + nomePraias[indexMaiorDistancia]);
        System.out.println("O número de praias entras 10 e 15Km é: " + contadorDistanciaEntre10E15Km);
        System.out.println("A distância média é: " + distanciaMedia);
    }
}

