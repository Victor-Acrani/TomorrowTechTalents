package aula05;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true){
            System.out.println("1-> média aritmética, 2-> média ponderada, 3-> sair");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Digite nota 1");
                double nota1 = sc.nextDouble();
                System.out.println("Digite nota 2");
                double nota2 = sc.nextDouble();
                System.out.println("Média aritmética: " + ((nota1+nota2)/2));
            } else if (opcao == 2){
                double[] nota = new double[3];
                double[] peso= new double[3];
                for (int i = 0; i < nota.length; i++) {
                    System.out.println("Digite nota " + (i+1));
                    nota[i] = sc.nextDouble();
                    System.out.println("Digite peso " + (i+1));
                    peso[i] = sc.nextDouble();
                }
                double mediaPonderada = ((peso[0]*nota[0])+(peso[1]*nota[1])+(peso[2]*nota[2]))/(peso[0]+peso[1]+peso[2]);
                System.out.printf("Media ponderada%.2f%n:" + mediaPonderada);
            } else if (opcao == 3){
                System.out.println("Saindo.");
                break;
            } else {
                System.out.println("Digite uma opção válida.");
            }
        }
        sc.close();
    }
}
