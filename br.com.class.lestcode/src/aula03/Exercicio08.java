package aula03;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        System.out.println("Insira 10 números inteiros e positivos");
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        double total = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
            total += numeros[i];
        }

        sc.close();

        for(int i = 0; i <10; i++) {
            for(int j = i; j < 10; j++) {

                if(numeros[j] < numeros[i]) {
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }

        System.out.println("O maior valor é " + numeros[9]);
        System.out.println("O maior valor é " + numeros[0]);

        double media = total /10 ;
        System.out.println("A média é " + media);
    }
}

