package Modulo1.aula04;

import java.util.Random;

public class Exercicio09 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        Random random = new Random();

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        //letra a
        int[] somaLinha = new int[3];
        int somaDaLinha;
        for (int i = 0; i < 3; i++){
            somaDaLinha = 0;
            for(int j = 0; j < 5; j++){
                somaDaLinha += matriz[i][j];
            }
            somaLinha[i]=somaDaLinha;
        }

        System.out.println(" ");

        //letra b
        int[] somaColuna = new int[5];
        int somaDaColuna;
        for (int i = 0; i < 5; i++){
            somaDaColuna = 0;
            for(int j = 0; j < 3; j++){
                somaDaColuna += matriz[j][i];
            }
            somaColuna[i] = somaDaColuna;
        }

        System.out.println(" ");

        //letra c
        int totalLinha = 0;
        for(int i = 0; i < somaLinha.length; i++){
            totalLinha += somaLinha[i];
        }
        System.out.println("soma da linhas: " + totalLinha);
        System.out.println(" ");

        //letra d
        int totalColuna = 0;
        for(int i = 0; i < somaColuna.length; i++){
            totalColuna += somaColuna[i];
        }
        System.out.println("soma das colunas: " + totalColuna);
        System.out.println(" ");

        // letra e
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
