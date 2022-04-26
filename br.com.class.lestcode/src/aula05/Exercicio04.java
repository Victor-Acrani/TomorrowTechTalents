package aula05;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a velocidade da via (Km/h).");
        double velocidadeVia = sc.nextDouble();
        System.out.println("Insira a velocidade do carro (Km/h).");
        double velocidadeCarro = sc.nextDouble();
        sc.close();
        double diferenca = Math.abs(velocidadeVia-velocidadeCarro);
        double multa;


        if (diferenca <= 0){
            multa = 0;
        } else if (diferenca >  0 && diferenca <= 10){
            multa = 50;
        } else if (diferenca > 10 && diferenca <= 30) {
            multa = 100;
        } else {
            multa = 200;
        }

        if (multa == 0){
            System.out.println("Não existe multa.");
        } else {
            System.out.println("Valor da multa: R$" + multa);
        }
    }
}
