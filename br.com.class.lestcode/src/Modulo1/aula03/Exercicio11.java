package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        System.out.println("Digite dois números inteiros.");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        sc.close();
        int i;
        int j;

        if (numero1 > numero2) {
            j = numero1;
            i = numero2;
        } else {
            i = numero1;
            j = numero2;
        }

        if (numero1 == numero2) {
            System.out.println("Não existem números entre os dois números inseridos pois são iguais.");
        } else {

            while(i < j-1) {
                System.out.println(++i);
            }
        }
    }
}
