package Modulo1.aula05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        String[][] matriz = new String[10][3];
        Scanner sc = new Scanner(System.in);
        String opcao;
        int index;

        while(true){
            System.out.println("Digite 1 para inserir contato, 2 para remover contato e 3 para sair.");
            opcao = sc.nextLine();
            if (opcao.equals("1")){
                    // verifica posição vazia
                    for (int i = 0; i < matriz.length; i++) {
                        index = i;
                        if (matriz[i][0] == null){
                            System.out.println("Insira o código da " +(index+1)+"° pessoa.");
                            matriz[i][0] = sc.nextLine();
                            System.out.println("Insira o telefone da " +(index+1)+"° pessoa.");
                            matriz[i][1] = sc.nextLine();
                            System.out.println("Insira a idade da " +(index+1)+"° pessoa.");
                            matriz[i][2] = sc.nextLine();
                            break;
                        }
                        if (index==9){
                            System.out.println("Agenda está lotada. Delete um contato para inserir um novo.");
                        }
                    }
            }
            if (opcao.equals("2")){
                System.out.println("Contatos armazenados.");
                for (int i = 0; i < matriz.length; i++) {
                    System.out.println((i+1)+" -> "+"Código: " +matriz[i][0]+ " /Telefone: " +matriz[i][1]+ " /idade: "+matriz[i][2]);
                }
                System.out.println("Escolha um contato (1 a 10) para deletar.");
                index = sc.nextInt()-1;
                sc.nextLine();
                matriz[index][0] = null;
                matriz[index][1] = null;
                matriz[index][2] = null;

                for (int i = 0; i < matriz.length; i++) {
                    System.out.println("Contatos atualizados.");
                    System.out.println((i+1)+" -> "+"Código: " +matriz[i][0]+ " /Telefone: " +matriz[i][1]+ " /idade: "+matriz[i][2]);
                }
            }
            if (opcao.equals("3")){
                System.out.println("Saindo da aplicação");
                break;
            }
        }
        sc.close();
    }
}
