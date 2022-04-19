package aula01;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        final int NUMEROS_PATAS_CAVALO = 4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira número de cavalos comprados para o haras.");
        int quantidadeCavalos = sc.nextInt();
        sc.close();

        int numeroFerraduras = NUMEROS_PATAS_CAVALO * quantidadeCavalos;

        System.out.println("São necessárias " + numeroFerraduras + " ferraduras.");
    }
}
