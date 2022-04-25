package aula04;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        System.out.println("Digite um DDD para saber a cidade:");
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();
        sc.close();

        switch (ddd){
            case 61:
                System.out.println("61 é DDD de Brasília.");
                break;
            case 71:
                System.out.println("71 é DDD de Salvador.");
                break;
            case 11:
                System.out.println("11 é DDD de São Paulo.");
                break;
            case 21:
                System.out.println("21 é DDD de Rioa de Janeiro.");
                break;
            case 32:
                System.out.println("32 é DDD de Juiz de Fora.");
                break;
            case 19:
                System.out.println("19 é DDD de Campinas.");
                break;
            case 27:
                System.out.println("27 é DDD de Vitória.");
                break;
            case 31:
                System.out.println("31 é DDD de Belo Horizonte.");
                break;
            default:
                System.out.println("DDD não cadastrado");
                break;
        }
    }
}
