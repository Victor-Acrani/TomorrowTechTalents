package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Insira 10 valores:");
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[2][5];

        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }
        sc.close();

        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%4.2f ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
