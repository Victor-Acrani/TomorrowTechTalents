package Modulo2.aula04;

import java.util.ArrayList;
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
        System.out.println();
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
                System.out.println("Atualizar cadastro.");
                opcao = validarOpcao(scanner);
                atualizar(opcao,scanner,escola);
                return true;
            case 4:
                System.out.println("Deletar cadastro.");
                opcao = validarOpcao(scanner);
                deletar(opcao,scanner,escola);
                return true;
            case 5:
                System.out.println("Buscar cadastro por id.");
                opcao = validarOpcao(scanner);
                buscarPorId(opcao,scanner,escola);
                return true;
            case 6:
                System.out.println("Calcular média de aluno.");
                mediaNotaAluno(scanner,escola);
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
            System.out.println("1-> Funcionário, 2-> Aluno, 3-> Professor.");
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
            System.out.println("----------Cadastro de Funcionário----------");
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
        }
        else if (opcao == 2) {
            System.out.println("----------Cadastro de Aluno----------");
            System.out.println("Insira o nome.");
            String nome = scanner.nextLine();
            System.out.println("Insira o cpf.");
            String cpf = scanner.nextLine();
            System.out.println("Insira o rg.");
            String rg = scanner.nextLine();
            System.out.println("Insira a idade.");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Insira a turma.");
            String turma = scanner.nextLine();

            ArrayList<Notas> notas = new ArrayList<Notas>();
            for (int i = 0; i < 2; i++){
                System.out.println("Insira a nota " + (i+1) + "° de matemática.");
                double notaMatematica = scanner.nextDouble();
                System.out.println("Insira a nota " + (i+1) + "° de português.");
                double notaPortugues = scanner.nextDouble();
                Notas nota = new Notas(notaMatematica, notaPortugues);
                notas.add(nota);
            }
            escola.cadastrarAluno(nome, cpf, rg, idade, turma, notas);
        }
        else if (opcao == 3) {
            System.out.println("----------Cadastro de Professor----------");
            System.out.println("Insira o nome.");
            String nome = scanner.nextLine();
            System.out.println("Insira o cpf.");
            String cpf = scanner.nextLine();
            System.out.println("Insira o rg.");
            String rg = scanner.nextLine();
            System.out.println("Insira o salário.");
            Double salario = scanner.nextDouble();
            System.out.println("Insira o número de turmas.");
            int turmas = scanner.nextInt();
            System.out.println("Insira o múmero de disciplinas.");
            int disciplinas = scanner.nextInt();
            escola.cadastrarProfessor(nome, cpf, rg, salario, turmas, disciplinas);
        }
    }

    private static void listar(int opcao, Escola escola){
        if (opcao == 1){
            System.out.println("----------Funcionários cadastrados----------");
            escola.listarFuncionario();
        }
        else if (opcao == 2) {
            System.out.println("----------Alunos cadastrados----------");
            escola.listarAlunos();
        }
        else if (opcao == 3) {
            System.out.println("----------Professores cadastrados----------");
            escola.listarProfessor();
        }
    }

    private static void atualizar(int opcao, Scanner scanner, Escola escola){
        if (opcao == 1){
            System.out.println("----------Atualizar cadastro Funcionário----------");
            escola.listarFuncionario();
            System.out.println("Insira o Id do funcionário");
            long id = scanner.nextLong();
            scanner.nextLine();

            if (escola.existeIdFuncionario(id)){
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
                escola.atualizarFuncionario(id, nome, cpf, rg, cargo, salario);
            }
        }
        else if (opcao == 2) {
            System.out.println("----------Atualizar cadastro Aluno----------");
            escola.listarAlunos();
            System.out.println("Insira o Id do aluno");
            long id = scanner.nextLong();
            scanner.nextLine();

            if (escola.existeIdAluno(id)) {
                System.out.println("Insira o nome.");
                String nome = scanner.nextLine();
                System.out.println("Insira o cpf.");
                String cpf = scanner.nextLine();
                System.out.println("Insira o rg.");
                String rg = scanner.nextLine();
                System.out.println("Insira a idade.");
                int idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Insira a turma.");
                String turma = scanner.nextLine();

                ArrayList<Notas> notas = new ArrayList<Notas>();
                for (int i = 0; i < 2; i++){
                    System.out.println("Insira a nota " + (i+1) + "° de matemática.");
                    double notaMatematica = scanner.nextDouble();
                    System.out.println("Insira a nota " + (i+1) + "° de português.");
                    double notaPortugues = scanner.nextDouble();
                    Notas nota = new Notas(notaMatematica, notaPortugues);
                    notas.add(nota);
                }
                escola.atualizarAlunos(id, nome, cpf, rg, idade, turma, notas);
            }
        }
        else if (opcao == 3) {
            System.out.println("----------Atualizar cadastro Professor----------");
            escola.listarProfessor();
            System.out.println("Insira o Id do professor");
            long id = scanner.nextLong();
            scanner.nextLine();

            if (escola.existeIdProfessor(id)){
                System.out.println("Insira o nome.");
                String nome = scanner.nextLine();
                System.out.println("Insira o cpf.");
                String cpf = scanner.nextLine();
                System.out.println("Insira o rg.");
                String rg = scanner.nextLine();
                System.out.println("Insira o salário.");
                Double salario = scanner.nextDouble();
                System.out.println("Insira o número de turmas.");
                int turmas = scanner.nextInt();
                System.out.println("Insira o múmero de disciplinas.");
                int disciplinas = scanner.nextInt();
                escola.atualizarProfessor(id, nome, cpf, rg, salario, turmas, disciplinas);
            }
        }
    }

    private static void deletar(int opcao, Scanner scanner, Escola escola) {
        if (opcao == 1){
            System.out.println("----------Remover Funcionário----------");
            escola.listarFuncionario();
            System.out.println("Insira o Id do funcionário");
            long id = scanner.nextLong();

            if (escola.existeIdFuncionario(id)){
                escola.deletarFuncionario(id);
            }
        }
        else if (opcao == 2) {
            System.out.println("----------Remover Aluno----------");
            escola.listarAlunos();
            System.out.println("Insira o Id do aluno");
            long id = scanner.nextLong();

            if (escola.existeIdAluno(id)){
                escola.deletarAluno(id);
            }
        }
        else if (opcao == 3) {
            System.out.println("----------Remover Professor----------");
            escola.listarProfessor();
            System.out.println("Insira o Id do professor");
            long id = scanner.nextLong();

            if (escola.existeIdProfessor(id)){
                escola.deletarProfessor(id);
            }
        }
    }

    private static void buscarPorId(int opcao, Scanner scanner, Escola escola) {
        if (opcao == 1){
            System.out.println("----------Buscar Funcionário por id----------");
            System.out.println("Insira o Id do funcionário");
            long id = scanner.nextLong();

            if (escola.existeIdFuncionario(id)){
                escola.buscarFuncionarioPorID(id);
            }
        }
        else if (opcao == 2) {
            System.out.println("----------Buscar Aluno por id----------");
            System.out.println("Insira o Id do aluno");
            long id = scanner.nextLong();

            if (escola.existeIdAluno(id)){
                escola.buscarAlunoPorID(id);
            }
        }
        else if (opcao == 3) {
            System.out.println("----------Buscar Professor por id----------");
            System.out.println("Insira o Id do professor");
            long id = scanner.nextLong();

            if (escola.existeIdProfessor(id)){
                escola.buscarProfessorPorID(id);
            }
        }
    }

    private static void mediaNotaAluno(Scanner scanner, Escola escola) {
        System.out.println("----------Média das notas----------");
        escola.listarAlunos();
        System.out.println("Insira o Id do aluno");
        long id = scanner.nextLong();

        if (escola.existeIdAluno(id)){
            escola.mediaNotaAluno(id);
        }
    }
}
