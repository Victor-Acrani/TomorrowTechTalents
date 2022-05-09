
package Modulo1.aula01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        System.out.println("Cálculo da média de consumo do seu carro.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distância total em KM.");
        double kilometragem = sc.nextDouble();
        System.out.println("Insira a quantidade de combustível em L.");
        double litros = sc.nextDouble();
        sc.close();

        System.out.printf("O consumo médio do seu carro é de %.2fKm/L", (kilometragem/litros));
    }

}
