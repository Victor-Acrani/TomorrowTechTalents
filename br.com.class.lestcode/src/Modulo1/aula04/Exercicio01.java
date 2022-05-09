package Modulo1.aula04;

import java.util.Random;

public class Exercicio01 {

    public static void main(String[] args) {
        double[] array = new double[10];
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            array[i] = random.nextDouble() * 100;
            System.out.printf("Número %d do array vale %.2f%n", i+1, array[i]);
        }
    }
}
