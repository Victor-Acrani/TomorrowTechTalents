package Modulo1.aula02;

public class Exercicio03 {

    public static void main(String[] args) {

        String[] alunos = new String[6];
        String[] notas = new String[6];

        alunos[0] = "ALUNOS(A)";
        alunos[1] = "==========";
        alunos[2] = "ALINE";
        alunos[3] = "MÁRIO";
        alunos[4] = "SÉRGIO";
        alunos[5] = "SHIRLEY";

        notas[0] = "NOTA";
        notas[1] = "=====";
        notas[2] = "9.0";
        notas[3] = "DEZ";
        notas[4] = "4.5";
        notas[5] = "7.0";

        for (int i = 0; i <= 5; i++) {
            System.out.printf("%-10s %-5s%n", alunos[i], notas[i]);
        }
    }
}
