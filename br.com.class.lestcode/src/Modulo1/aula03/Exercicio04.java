package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <5; i++) {
            System.out.println("Digite um número.");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i <5; i++) {
            for(int j = i; j < 5; j++) {

                if(numeros[j] < numeros[i]) {
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }

        for(int i = 0; i <5; i++) {
            System.out.println(numeros[i]);
        }
    }
}

