package Modulo1.aula01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        System.out.println("Cálculo de quantos dias uma pessoa viveu baseado na idade.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a data de nascimento: (Ex: dd/MM/yyyy)");
        String data = sc.nextLine();
        sc.close();

        String[] split = data.split("/");
        LocalDate nascimento = LocalDate.of(Integer.parseInt(split[2]), Integer.parseInt(split[1]), Integer.parseInt(split[0]));
        LocalDate dataAtual = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(nascimento, dataAtual);
        System.out.printf("A pessoa já viveu %d dias", dias);

    }
}

