package aula02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        double soma = 0;
        double numero;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= 3; i++) {
            System.out.println("Insira o " + (i+1) +"° número");
            numero = sc.nextDouble();
            soma += Math.pow(numero, 2);
        }
        sc.close();

        System.out.println("A soma do quadrado dos números é " + soma);
    }
}

