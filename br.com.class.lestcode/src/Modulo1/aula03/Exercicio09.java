package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        System.out.println("Insira a idade de 10 pessoas");
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10];
        int contadorMaiorIdade = 0;

        for (int i = 0; i < 10; i++) {
            idades[i] = sc.nextInt();

            if (idades[i] > 18) {
                contadorMaiorIdade++;
            }
        }

        sc.close();
        System.out.println(contadorMaiorIdade + " pessoas são maior de idade.");
    }
}

