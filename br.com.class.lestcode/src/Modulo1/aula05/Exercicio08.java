package Modulo1.aula05;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idade = new int[7];
        double[] peso = new double[7];
        int totalIdade = 0;
        int countPesoMaior90 = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade da " +(i+1)+"° pessoa");
            idade[i] = sc.nextInt();
            System.out.println("Digite o peso da " +(i+1)+"° pessoa");
            peso[i] = sc.nextDouble();

            totalIdade += idade[i];
            if (peso[i] > 90.0){
                countPesoMaior90++;
            }
        }
        sc.close();

        double mediaIdade = (double)totalIdade/idade.length;
        System.out.printf("Média das idades: %.2f%n", mediaIdade);
        System.out.println(countPesoMaior90 +" Pessoas com mais de 90Kg.");
    }
}
