package Modulo1.aula04;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        System.out.println("Insira um valor inteiro:");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        sc.close();

        int numeroMinimo;
        int totalNotas = 0;
        int[] notas = {100,50,20,10,5,2,1};

        for(int i = 0; i < notas.length; i++){
            if(valor >= notas[i]){
                numeroMinimo = valor/notas[i];
                totalNotas += numeroMinimo;
                valor = valor%notas[i];
                System.out.printf("%nSão preciso %d notas de %d",numeroMinimo, notas[i]);
            }
        }
        System.out.println();
        System.out.println("Número mínimo de notas:" + totalNotas);
    }
}

