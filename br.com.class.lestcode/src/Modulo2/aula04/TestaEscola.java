package Modulo2.aula04;

import java.util.Scanner;

public class TestaEscola {

    public static void main(String[] args) {

        Escola escola = new Escola();
        Scanner scanner = new Scanner(System.in);
        boolean executarApp = true;

        while (executarApp){
            executarApp = menu(scanner, escola);
        }
        scanner.close();
    }

    //--------------------MÉTODOS------------------------
    private static boolean menu(Scanner scanner, Escola escola){
        System.out.println("Bem vindo ao app da escola de programação.");
        System.out.println("1-> Cadastrar pessoa. 2-> Listar cadastros. 3-> Atualizar cadastro. 4->Deletar cadastro." +
                " 5-> Listar cadastro específico. 6-> Calcular média de aluno. 7-> Sair.");
        int opcao;
        int acao = scanner.nextInt();

        switch (acao){
            case 1:
                System.out.println("Cadastrar pessoa.");
                opcao = validarOpcao(scanner);
                scanner.nextLine();
                cadastrar(opcao, scanner, escola);
                return true;
            case 2:
                System.out.println("Listar cadastros.");
                opcao = validarOpcao(scanner);
                listar(opcao,escola);
                return true;
            case 3:
                System.out.println("Atualizar cadastro");
                opcao = validarOpcao(scanner);
                return true;
            case 4:
                System.out.println("Deletar cadastro");
                opcao = validarOpcao(scanner);
                return true;
            case 5:
                System.out.println("Listar cadastro específico");
                opcao = validarOpcao(scanner);
                return true;
            case 6:
                System.out.println("Calcular média de aluno");
                return true;
            case 7:
                System.out.println("Fechando aplicação");
                return false;
            default:
                System.out.println("Digite uma opção válida");
                return true;
        }
    }

    private static int validarOpcao(Scanner scanner){
        int opcao = 0;
        boolean executar = true;

        while (executar){
            System.out.println("1-> Funcioanário, 2-> Aluno, 3-> Professor.");
            opcao = scanner.nextInt();
            if (opcao == 1 || opcao == 2 || opcao == 3){
                executar = false;
            } else {
                System.out.println("Digite uma opção válida");
                executar = true;
            }
        }
        return opcao;
    }

    private static void cadastrar(int opcao, Scanner scanner, Escola escola){
        if (opcao == 1){
            System.out.println("----------Cadastro de funcionário----------");
            System.out.println("Insira o nome.");
            String nome = scanner.nextLine();
            System.out.println("Insira o cpf.");
            String cpf = scanner.nextLine();
            System.out.println("Insira o rg.");
            String rg = scanner.nextLine();
            System.out.println("Insira o cargo.");
            String cargo = scanner.nextLine();
            System.out.println("Insira o salário.");
            Double salario = scanner.nextDouble();
            escola.cadastrarFuncionario(nome,cpf,rg,cargo,salario);
            System.out.println("Funcionário cadastrado!");
        }
        else if (opcao == 2) {
            System.out.println("----------Cadastro de Aluno----------");
            System.out.println("Aluno cadastrado!");
        }
        else if (opcao == 3) {
            System.out.println("----------Cadastro de Professor----------");
            System.out.println("Professor cadastrado!");
        }
    }

    private static void listar(int opcao, Escola escola){
        if (opcao == 1){
            System.out.println("----------Funcionários cadastrados----------");
            escola.listarFuncionario();
        }
        else if (opcao == 2) {
            System.out.println("----------Alunos cadastrados----------");

        }
        else if (opcao == 3) {
            System.out.println("----------Professores cadastrados----------");

        }
    }

    private static void atualizar(int opcao, Scanner scanner, Escola escola){
        if (opcao == 1){
            System.out.println("----------Atualizar cadastro Funcionário----------");
            escola.listarFuncionario();
            System.out.println("Insira o Id do funcionário");
            long id = scanner.nextLong();

        }
        else if (opcao == 2) {
            System.out.println("----------Atualizar cadastro Aluno----------");

        }
        else if (opcao == 3) {
            System.out.println("----------Atualizar cadastro Professor----------");

        }
    }

}
