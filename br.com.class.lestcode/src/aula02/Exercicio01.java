package aula02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do aluno/a. ");
        String nome = sc.nextLine();
        System.out.println("Insira a turma do aluno/a. ");
        String turma = sc.nextLine();
        System.out.println("Insira o nome da primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira o nome da segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Insira o nome da terceira nota: ");
        double nota3 = sc.nextDouble();
        sc.close();

        double notaMedia = (nota1+nota2+nota3)/3;
        System.out.printf("A nota média do aluno/a %s da turma %s é %.2f", nome, turma ,notaMedia);
    }
}

