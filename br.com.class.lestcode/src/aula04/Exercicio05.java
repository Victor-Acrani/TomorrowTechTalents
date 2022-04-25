package aula04;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Insira as dimensões da matriz");
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de linhas da matriz");
        int linha = sc.nextInt();
        System.out.println("Número de colunas da matriz");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        int soma = 0;
        double media;

        System.out.printf("insira %d números para completar a matriz.%n",(linha*coluna));

        for (int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Escolha uma linha da matriz para saber a média dos valores");
        System.out.printf("A matriz possui %d linhas%n", linha);
        int linhaEscolhida = sc.nextInt();
        sc.close();

        for(int j = 0; j < coluna; j++){
            soma += matriz[linhaEscolhida-1][j];
        }
        media = (double)soma/coluna;
        System.out.println("A soma de todos os elementos é: "+ media);
    }
}
