package Modulo1.aula05;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você fuma a quantos ano?");
        int anos = sc.nextInt();
        System.out.println("Quantos cigarros você fuma por dia?");
        int qntCigarros = sc.nextInt();
        System.out.println("Qual é o preço do maço de cigarros?");
        double precoMaco = sc.nextDouble();
        double precoIndividual = precoMaco/20;
        sc.close();

        double custo = (anos*365) * qntCigarros * precoIndividual;
        System.out.printf("%nVocê gastou R$%.2f com cigarros ao longo da vida.", custo);
    }
}
