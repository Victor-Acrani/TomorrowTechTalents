package Modulo1.aula03;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        System.out.println("Digite suas informações pessoais.");
        Scanner sc = new Scanner(System.in);
        boolean dadoValido = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Digite seu nome. Mínimo 3 letras.");
            nome = sc.nextLine();
            if (nome.length() >= 3) {
                dadoValido = true;
            } else {
                System.out.println("Favor inserir um nome válido.");
            }
        } while(!dadoValido);

        do {
            dadoValido = false;
            System.out.println("Digite sua idade (0 a 150 anos).");
            idade = sc.nextInt();
            if (idade >=0 && idade <= 150) {
                dadoValido = true;
            } else {
                System.out.println("Favor inserir uma idade válida.");
            }
        } while(!dadoValido);

        do {
            dadoValido = false;
            System.out.println("Digite seu salário.");
            salario = sc.nextDouble();
            if (salario >=0) {
                dadoValido = true;
            } else {
                System.out.println("Favor inserir um salário válido.");
            }
        } while(!dadoValido);

        do {
            dadoValido = false;
            System.out.println("Digite o seu sexo: 'm' Masculino e 'f' feminino.");
            sexo = sc.nextLine();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                dadoValido = true;
            } else {
                System.out.println("Favor inserir um sexo válido.");
            }
        } while(!dadoValido);

        do {
            dadoValido = false;
            System.out.println("Digite o seu estado civil: 's' Solteiro(a), 'c' Casado(a), 'v' Viúvo(a), 'd' Divorciado(a).");
            estadoCivil = sc.nextLine();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                dadoValido = true;
            } else {
                System.out.println("Favor inserir um estado civil válido.");
            }
        } while(!dadoValido);

        System.out.println("TODOS OS DADOS SÃO VÁLIDOS. seguem abaixo os dados inseridos.");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        sc.close();
    }
}

