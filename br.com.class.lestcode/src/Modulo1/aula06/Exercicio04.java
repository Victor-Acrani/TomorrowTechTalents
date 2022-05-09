package Modulo1.aula06;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        System.out.println("Cadastre as 5 cidades.");
        Scanner sc = new Scanner(System.in);
        int numeroCidades = 5;
        int[][] cidades = new int[numeroCidades][3];
        int maiorNumeroAcidentes = 0;
        int menorNumeroAcidentes = 0;
        int indexMaiorAcidentes = 0;
        int indexMenorAcidentes = 0;
        int totalVeiculos = 0;
        int totalAcidentes = 0;
        int countMenos2000Veiculos = 0;

        for (int i = 0; i < cidades.length; i++) {
            System.out.printf("%nDigite o código da %d cidade.", (i+1));
            cidades[i][0] = sc.nextInt(); // código cidade
            System.out.printf("%nDigite o numero de veículos da %d cidade.", (i+1));
            cidades[i][1] = sc.nextInt(); // número veículos
            System.out.printf("%nDigite o números de acidentes com vítimas da %d cidade.", (i+1));
            cidades[i][2] = sc.nextInt(); // número acidentes

            if (cidades[i][2] > maiorNumeroAcidentes){
                indexMaiorAcidentes = i;
                maiorNumeroAcidentes = cidades[i][2];
            }
            if (i == 0){
                indexMenorAcidentes = i;
                menorNumeroAcidentes = cidades[i][2];
            }
            if (cidades[i][2] < menorNumeroAcidentes){
                indexMenorAcidentes = i;
                menorNumeroAcidentes = cidades[i][2];
            }

            totalVeiculos += cidades[i][1];

            if (cidades[i][1] < 2000){
                totalAcidentes += cidades[i][2];
                countMenos2000Veiculos++;
            }
        }

        System.out.printf("%nMaior indice de acidentes -> Código: %d / Número acidentes: %d",
                cidades[indexMaiorAcidentes][0], cidades[indexMaiorAcidentes][2]);
        System.out.printf("%nMenor indice de acidentes -> Código: %d / Número acidentes: %d",
                cidades[indexMenorAcidentes][0], cidades[indexMenorAcidentes][2]);
        System.out.printf("%nMedia de veículos %.2f", (double)totalVeiculos/numeroCidades);
        System.out.printf("%nMédia de acidentes para cidade com menos de 2000 veículos: %.2f", (double)totalAcidentes/countMenos2000Veiculos);
    }
}
