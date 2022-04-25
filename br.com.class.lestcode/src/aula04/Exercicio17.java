package aula04;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        System.out.println("Digite o número de habitantes.");
        double salario=0;
        int filhos;
        int habitantes = 0;
        long totalSalario = 0;
        long totalFilhos = 0;
        double maiorSalario = -10;
        int salarioMenor150 = 0;
        Scanner sc = new Scanner(System.in);

        while(salario >= 0){
            System.out.printf("%nDigite o salário do %d habitante.", habitantes+1);
            salario = sc.nextDouble();

            if(salario < 0){
                System.out.printf("%nFim da inserção de dados.");
                break;
            }

            System.out.printf("%nDigite o numero de filhos do %d habitante.",habitantes+1);
            filhos = sc.nextInt();

            totalSalario += salario;
            totalFilhos += filhos;
            habitantes++;

            if (salario > maiorSalario){
                maiorSalario = salario;
            }
            if (salario < 150.0){
                salarioMenor150++;
            }
        }

        double mediaSalario = (double)totalSalario/habitantes;
        double mediaFilhos = (double)totalFilhos/habitantes;
        double percentualSalarioMenor150 = (double)salarioMenor150/habitantes*100;
        System.out.printf("%nMedia de salário da população: R$%.2f", mediaSalario);
        System.out.printf("%nMedia de filhos da população: %.2f ", mediaFilhos);
        System.out.printf("%nO maior salário é: R$%.2f", maiorSalario);
        System.out.printf("%nO percentual de habitantes com salário menor que R$150,00 é: %.2f porcento", percentualSalarioMenor150 );
        sc.close();
    }
}
