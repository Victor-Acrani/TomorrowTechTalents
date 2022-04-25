package aula04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Insira as dimensões da matriz");
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de linhas da matriz");
        int linha = sc.nextInt();
        System.out.println("Número de colunas da matriz");
        int coluna = sc.nextInt();
        double[][] matriz = new double[linha][coluna];
        double maiorValor = -1000;

        System.out.printf("insira %d números para completar a matriz.%n",(linha*coluna));

        for (int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                matriz[i][j] = sc.nextDouble();
                if(maiorValor < matriz[i][j]){
                    maiorValor = matriz[i][j];
                }
            }
        }
        sc.close();
        System.out.printf("O maior valor é %.2f: ", maiorValor);
    }
}
