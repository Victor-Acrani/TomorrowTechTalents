package aula05;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] questionario = new int[5][2];
        int regular = 0;
        int bom = 0;
        int otimo = 0;
        int idadeOtimoTotal = 0;

        for (int i = 0; i < questionario.length; i++) {
            System.out.println((i+1) + "° entrevistado:");
            System.out.println("O que achou do filme? 1-> regular, 2-> bom, 3-> ótimo");
            questionario[i][0] = sc.nextInt();
            System.out.println("Insira a sua idade");
            questionario[i][1] = sc.nextInt();

            if (questionario[i][0] == 1){
                regular++;
            } else if (questionario[i][0] == 2) {
                bom++;
            } else if (questionario[i][0] == 3) {
                otimo++;
                idadeOtimoTotal += questionario[i][1];
            }
        }
        sc.close();

        System.out.println("Média de idade das pessoas que respoderam ótimo:" + (double)idadeOtimoTotal/otimo);
        System.out.println("Pessoas que respondem regular: " + regular);
        System.out.println("Percentual de pessoas que responderam 'bom': " + (double)bom/5*100 + "%");
    }
}
