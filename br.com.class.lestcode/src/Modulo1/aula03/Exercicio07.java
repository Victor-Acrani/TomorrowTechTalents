package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro");
        int numero = sc.nextInt();
        sc.close();

        int fatorial = numero;

        if (numero == 0) {
            fatorial = 1;
        } else {

            while(numero > 1) {
                numero --;
                fatorial *= numero;
            }
        }

        System.out.println(fatorial);
    }
}

