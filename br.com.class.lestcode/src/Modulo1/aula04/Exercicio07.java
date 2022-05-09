package Modulo1.aula04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        char[] gabarito = new char[13];
        Random random = new Random();
        for(int i = 0; i < 13; i++){
            gabarito[i] = (char)(random.nextInt(4)+97);
        }

        System.out.println("Insira sua aposta de 13 números. Inserir apenas 1, 2 ou 3.");
        Scanner sc = new Scanner(System.in);
        String[] resposta = new String[13];
        int acertos = 0;

        for(int i = 0; i < 13; i++){
            resposta[i] = sc.next();
            if(resposta[i].charAt(0) == gabarito[i]){
                acertos++;
            }
        }
        sc.close();

        for(int i = 0; i < 13; i++){
            System.out.printf("%s ",gabarito[i]);
        }
        System.out.println();
        for(int i = 0; i < 13; i++){
            System.out.printf("%s ",resposta[i]);
        }
        if(acertos >= 6){
            System.out.printf("%nParabéns! Você ganhou!");
        }else {
            System.out.printf("%nVocê acertou %d números", acertos);
        }

    }
}
