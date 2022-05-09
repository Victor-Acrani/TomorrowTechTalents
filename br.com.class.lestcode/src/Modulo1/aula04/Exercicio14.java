package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        System.out.println("Digite a idade de dois homens e duas mulheres, sendo que as"
                + "idades não podem ser as mesmas em cada sexo");
        Scanner sc = new Scanner(System.in);
        int[] idadeHomem = new int[2];
        int[] idadeMulher = new int[2];
        int index = 0;

        System.out.printf("%nDigite a idade do %d° homem:", index+1);
        idadeHomem[index] = sc.nextInt();
        index++;
        do {
            System.out.printf("%nDigite a idade do %d° homem:", index+1);
            idadeHomem[index] = sc.nextInt();
            if(idadeHomem[index-1] != idadeHomem[index]){
                index++;
            } else {
                System.out.println("Digite uma idade diferente.");
            }
        } while (index < 2);

        index = 0;
        System.out.printf("%nDigite a idade da %d° mulher:", index+1);
        idadeMulher[index] = sc.nextInt();
        index++;
        do {
            System.out.printf("%nDigite a idade do %d° mulher:", index+1);
            idadeMulher[index] = sc.nextInt();
            if(idadeMulher[index-1] != idadeMulher[index]){
                index++;
            } else {
                System.out.println("Digite uma idade diferente.");
            }
        } while (index < 2);

        index = 0;
        int homemVelho;
        int homenNovo;
        if(idadeHomem[index] > idadeHomem[index+1]){
            homemVelho = idadeHomem[index];
            homenNovo = idadeHomem[index+1];
        } else {
            homemVelho = idadeHomem[index+1];
            homenNovo = idadeHomem[index];
        }
        int mulherVelha;
        int mulherNova;
        if(idadeMulher[index] > idadeMulher[index+1]){
            mulherVelha = idadeMulher[index];
            mulherNova = idadeMulher[index+1];
        } else {
            mulherVelha = idadeMulher[index+1];
            mulherNova = idadeMulher[index];
        }

        int soma = homemVelho + mulherNova;
        int produto = homenNovo * mulherVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
    }
}
