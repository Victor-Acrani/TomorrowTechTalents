package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double altura;
        double peso;

        System.out.println("Digite a altura da pessoa.");
        altura = sc.nextDouble();
        System.out.println("Digite o peso da pessoa.");
        peso = sc.nextDouble();

        sc.close();

        double imc = peso / Math.pow(altura, 2);

        System.out.println("IMC = " + imc);

        if (imc < 18.5) {
            System.out.println("A pessoa está abaixo do peso");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("A pessoa está com peso normal");
        } else if (imc > 25.0 && imc < 29.9 ) {
            System.out.println("A pessoa está com excesso de peso");
        } else if (imc >= 30.0) {
            System.out.println("A pessoa está obesa");
        }
    }
}

