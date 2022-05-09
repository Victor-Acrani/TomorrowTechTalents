package Modulo1.aula06;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeAtleta;
        double[] distanciaSaltos = new double[5];
        double maiorSalto;
        int indexMaiorSalto = 0;
        double menorSalto;
        int indexMenorSalto = 0;
        double somaTresSaltos;
        double mediaSaltos;

        while (true){
            System.out.println("Digite o nome do atleta. Para sair não insira um nome.");
            nomeAtleta = sc.nextLine();
            if (nomeAtleta.isEmpty()){
                System.out.println("Saindo da aplicação");
                break;
            }

            // reset das variaveis.
            maiorSalto=0;
            menorSalto=0;
            somaTresSaltos=0;

            for (int i = 0; i < distanciaSaltos.length; i++) {
                System.out.printf("%nDigite distância do %d salto.%n",(i+1));
                distanciaSaltos[i] = sc.nextDouble();

                if (distanciaSaltos[i] > maiorSalto){
                    maiorSalto = distanciaSaltos[i];
                    indexMaiorSalto = i;
                }
                // recebe o primero salto para comparar com os demais
                if (i==0){
                    menorSalto = distanciaSaltos[i];
                    indexMenorSalto = i;
                }
                // compara com demais saltos
                if (distanciaSaltos[i] < menorSalto){
                    menorSalto = distanciaSaltos[i];
                    indexMenorSalto = i;
                }
            }

            for (int i = 0; i < distanciaSaltos.length; i++) {
                if (i != indexMaiorSalto && i!=indexMenorSalto){
                    somaTresSaltos += distanciaSaltos[i];
                }
            }
            mediaSaltos = somaTresSaltos/3;
            System.out.println("melhor salto: " + maiorSalto);
            System.out.println("pior salto: " + menorSalto);
            System.out.println("média dos saltos: " + mediaSaltos);

            System.out.printf("%nResultado final. %s - %.2f %n", nomeAtleta, mediaSaltos);
            sc.nextLine();
        }
        sc.close();
    }
}
