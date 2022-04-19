package aula03;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as 4 notas do aluno");
        double totalNotas = 0;

        for (int i = 0; i < 4; i++) {

            double nota = sc.nextDouble();
            totalNotas += nota;
        }

        sc.close();

        if ((totalNotas/4.0) > 7.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}

