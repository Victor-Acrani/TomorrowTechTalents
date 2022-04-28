package aula06;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoIdeal = 0;
        System.out.println("Insira o seu sexo. 'm' masculino e 'f' feminino.");
        String sexo = sc.nextLine();
        System.out.println("Insira sua altura");
        double altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("m")){
            pesoIdeal = (72.7*altura)-58;
        } else if (sexo.equalsIgnoreCase("f")) {
            pesoIdeal = (62.1*altura)-44.7;
        }

        System.out.printf("%nSeu peso ideal é %.2fKg", pesoIdeal);
    }
}
