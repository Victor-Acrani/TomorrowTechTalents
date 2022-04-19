package aula02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome completo.");
        String nome = sc.nextLine();
        System.out.println("Insira o seu endereço");
        String endereco = sc.nextLine();
        System.out.println("Insira o seu CEP");
        String cep = sc.nextLine();
        System.out.println("Insira o seu telefone");
        String telefone = sc.nextLine();
        sc.close();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu endereço é: " + endereco);
        System.out.printf("Seu CEP é %S e seu telefone é %s", cep, telefone);
    }
}
