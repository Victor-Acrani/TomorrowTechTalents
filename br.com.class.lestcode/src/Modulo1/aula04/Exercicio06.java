package Modulo1.aula04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        int[] gabarito = new int[13];
        Random random = new Random();
        for(int i = 0; i < 13; i++){
            gabarito[i] = (random.nextInt(2)+1);
        }

        System.out.println("Insira sua aposta de 13 números. Inserir apenas 1, 2 ou 3.");
        Scanner sc = new Scanner(System.in);
        int[] aposta = new int[13];
        int acertos = 0;

        for(int i = 0; i < 13; i++){
            aposta[i] = sc.nextInt();
            if(aposta[i] == gabarito[i]){
                acertos++;
            }
        }

        for(int i = 0; i < 13; i++){
            System.out.printf("%d ",gabarito[i]);
        }
        System.out.println();
        for(int i = 0; i < 13; i++){
            System.out.printf("%d ",aposta[i]);
        }
        if(acertos == 13){
            System.out.printf("Parabéns! Você ganhou!");
        }else {
            System.out.printf("Você acertou %d números", acertos);
        }

    }
}
