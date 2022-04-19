package aula01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do aluno/a. ");
        String nome = sc.nextLine();
        System.out.println("Insira o nome da primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira o nome da segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Insira o nome da terceira nota: ");
        double nota3 = sc.nextDouble();
        sc.close();

        double notaMedia = (nota1+nota2+nota3)/3;
        //System.out.println("A nota média do aluno/a " + nome + " é " + notaMedia);
        System.out.printf("A nota média do aluno/a %s é %.2f", nome ,notaMedia);

    }
}
