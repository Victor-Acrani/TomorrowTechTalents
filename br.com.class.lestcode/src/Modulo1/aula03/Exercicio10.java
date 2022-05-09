package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroInserido;
        boolean flagAcertou = false;
        int valorMaximo = 10;
        int valorMinimo = 1;
        int numeroAleatorio = (int) ((Math.random() * (valorMaximo - valorMinimo)) + valorMinimo);

        System.out.println("Um número entre 1 a 10 foi gerado. Tente adivinhar qual é. Você tem 3 tentativas.");

        for(int i = 0; i < 3; i++) {
            numeroInserido = sc.nextInt();

            if(numeroInserido == numeroAleatorio) {
                flagAcertou = true;
                break;
            } else if (numeroInserido > numeroAleatorio) {
                System.out.println("O número aleatório é menor. tente novamente.");
            } else {
                System.out.println("O número aleatório é maior. tente novamente.");
            }
        }
        sc.close();

        if(flagAcertou) {
            System.out.println("Parabéns. Você acertou!");
        } else {
            System.out.println("Você perdeu T.T");
        }
    }
}