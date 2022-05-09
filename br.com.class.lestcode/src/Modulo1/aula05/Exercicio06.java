package Modulo1.aula05;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade.");
        int idade = sc.nextInt();
        sc.close();

        if (idade > 18 && idade < 67){
            System.out.println("Você pode doar sangue.");
        } else {
            System.out.println("Você não pode doar sangue;");
        }
    }
}
