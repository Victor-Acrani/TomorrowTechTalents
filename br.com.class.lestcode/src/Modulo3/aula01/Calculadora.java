package Modulo3.aula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        boolean system = true;
        List<Double> numeros;
        Somar somar = new Somar();
        Subtrair subtrair = new Subtrair();
        Multiplicar multiplicar = new Multiplicar();
        Dividir dividir = new Dividir();
        Scanner scanner = new Scanner(System.in);

        while(system){
            System.out.println("App calculador. Escolha a função para usar.");
            System.out.println("0-> Sair, 1-> Soma, 2-> Subtrair, 3-> Multiplicar, 4-> Dividir");
            int acao = scanner.nextInt();
            scanner.nextLine();

            //verifica se a opção é válida
            if(acao > 4){
                System.out.println("Opção inválida.");
                continue;
            }

            //verifica se o usuário quer sair
            if (acao == 0){
                system = false;
                System.out.println("Saindo.");
                break;
            } else { //processa ação do usuário
                numeros = receberNumeros(scanner); //recebe n números do usuário

                //Valida input do usuário
                if (!numeros.isEmpty()){
                    Double resultado;
                    switch (acao){
                        case 1:
                            System.out.println("--------------Somar--------------");
                            resultado = somar.calcular(numeros);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 2:
                            System.out.println("--------------Subtrair--------------");
                            resultado = subtrair.calcular(numeros);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 3:
                            System.out.println("--------------Multiplicar--------------");
                            resultado = multiplicar.calcular(numeros);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 4:
                            System.out.println("--------------Dividir--------------");

                            resultado = dividir.calcular(numeros);
                            System.out.println("Resultado: " + resultado);
                            break;
                    }
                } else {
                    System.out.println("Input vazio.");
                }
            }
        }
    }

    private static List<Double> receberNumeros(Scanner scanner){
        boolean system = true;
        List<Double> numeros = new ArrayList<>();

        while (system){
            System.out.println("Insira um número ou s para sair.");
            String numeroUsuario = scanner.next();

            if (numeroUsuario.equalsIgnoreCase("s")){
                System.out.println("Foram digitados " + numeros.size() + " numeros.");
                numeros.forEach(System.out::println);
                system = false;
                break;
            }

            try {
                double parseNumeroUsuario = Double.parseDouble(numeroUsuario);
                numeros.add(parseNumeroUsuario);
            } catch (NumberFormatException e) {
                System.err.println("Por favor, insira um número ou s para sair.");
            }
        }
        return numeros;
    }
}
