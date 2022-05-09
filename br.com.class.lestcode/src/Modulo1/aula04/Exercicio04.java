package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Insira as dimensões da matriz");
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de linhas da matriz");
        int linha = sc.nextInt();
        System.out.println("Número de colunas da matriz");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        int soma = 0;

        System.out.printf("insira %d números para completar a matriz.%n",(linha*coluna));

        for (int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }
        sc.close();
        System.out.println("A soma de todos os elementos é: "+ soma);
    }
}
