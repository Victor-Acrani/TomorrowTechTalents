package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome de 10 pessoas.");

        for(int i = 0; i < nomes.length; i++){
            System.out.printf("%nInsira o nome da %d pessoa.", i+1);
            nomes[i] = sc.nextLine();
        }

        System.out.println("Digite um nome para encontrar.");
        String encontrar = sc.nextLine();
        boolean flag = false;

        for(int i = 0; i < nomes.length; i++){
            if(encontrar.equals(nomes[1])){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("ACHEI");
        } else {
            System.out.println("NÂO ACHEI");
        }
    }
}
