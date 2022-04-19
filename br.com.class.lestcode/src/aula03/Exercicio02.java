package aula03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero;

        do {

            System.out.println("Insira um número. Digite 0 para sair");
            numero = sc.nextDouble();
            if(numero > 0) {
                System.out.println("O número é positivo");
            } else if (numero < 0) {
                System.out.println("O número é negativo");
            }

        } while (numero != 0);

        System.out.println("Fechando a aplicação");

        sc.close();
    }
}
