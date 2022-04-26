package aula05;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] respostas = new String[5];
        System.out.println("Responda as seguintes perguntas com 'sim' ou 'nao'.");

        System.out.println("Telefonou para a vítima?");
        respostas[0] = sc.nextLine();
        System.out.println("Esteve no local do crime?");
        respostas[1] = sc.nextLine();
        System.out.println("Mora perto da vítima?");
        respostas[2] = sc.nextLine();
        System.out.println("Devia para a vítima?");
        respostas[3] = sc.nextLine();
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = sc.nextLine();
        sc.close();

        int contador = 0;
        for (int i = 0; i < respostas.length; i++) {
            if(respostas[i].equals("sim")){
                contador++;
            }
        }

        if (contador == 2){
            System.out.println("Suspeito.");
        } else if (contador == 3 || contador ==4) {
            System.out.println("Cúmplice.");
        } else if (contador == 5) {
            System.out.println("Assassino.");
        } else {
            System.out.println("Inocente.");
        }
    }
}
