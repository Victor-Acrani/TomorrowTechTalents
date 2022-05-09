package Modulo1.aula04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Insira um valor de 0 a 100.");
        Scanner sc = new Scanner(System.in);
        int aposta = sc.nextInt();
        boolean acertou = false;
        sc.close();

        int[][] matriz = new int[2][5];
        Random random = new Random();
        System.out.println("Números da matriz");
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = random.nextInt(100);
                if(aposta == matriz[i][j]){
                    acertou = true;
                }
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }

        if(acertou){
            System.out.println("O valor existe no conjunto");
        } else {
            System.out.println("O valor não existe no conjunto");
        }
    }
}
