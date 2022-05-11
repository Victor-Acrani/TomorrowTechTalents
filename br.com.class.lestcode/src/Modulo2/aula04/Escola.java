package Modulo2.aula04;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Professor> professores = new ArrayList<Professor>();
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Escola(){

    }
    //-------------------------------MÉTODOS FUNCIONÁRIO-------------------------------------------
    public void cadastrarFuncionario(String nome, String cpf, String rg, String cargo, double salario){
        this.funcionarios.add(new Funcionario(nome, cpf, rg, cargo, salario));
        System.out.println("Funcionário cadastrado!");
    }
    public void listarFuncionario(){
        this.funcionarios.forEach(System.out::println);
    }
    public void atualizarFuncionario(long id, String nome, String cpf, String rg, String cargo, double salario){

         this.funcionarios.stream()
                 .filter(x-> x.id == id)
                 .map(x -> x.setCargo(cargo).setSalario(salario).setNome(nome).setCpf(cpf).setRg(rg))
                 .forEach(System.out::println);
        System.out.println("Funcionário atualizado!");
    }
    public void deletarFuncionario(long id){
       if (this.funcionarios.removeIf(x-> x.id == id)){
           System.out.println("Funcionário deletado.");
       } else {
           System.out.println("Esse id não existe. Favor usar um id válido.");
       }
    }
    public void buscarFuncionarioPorID(long id){
        this.funcionarios.stream().filter(x-> x.id == id).forEach(System.out::println);
    }
    public boolean existeIdFuncionario(long id) {
        for (Funcionario funcionario : this.funcionarios) {
           if (funcionario.getId() == id){
               return true;
           }
        }
        System.out.println("Digite um Id válido.");
        return false;
    }

    //-------------------------------MÉTODOS PROFESSOR-------------------------------------------
    public void cadastrarProfessor(String nome, String cpf, String rg, double salario, int turmas, int disciplinas) {
        this.professores.add(new Professor(nome, cpf, rg, salario, turmas, disciplinas));
        System.out.println("Professor cadastrado!");
    }
    public void listarProfessor() {
        this.professores.forEach(System.out::println);
    }
    public void atualizarProfessor(long id, String nome, String cpf, String rg, double salario, int turmas, int disciplinas) {
        this.professores.stream()
                .filter(x -> x.id == id)
                .map(x -> x.setTurmas(turmas).setDisciplinas(disciplinas).setSalario(salario).setNome(nome).setCpf(cpf).setRg(rg))
                .forEach(System.out::println);
        System.out.println("Professor atualizado atualizado!");
    }
    public void deletarProfessor(long id) {
        if (this.professores.removeIf(x -> x.id == id)){
            System.out.println("Professor deletado.");
        } else {
            System.out.println("Esse id não existe. Favor usar um id válido.");
        }
    }
    public void buscarProfessorPorID(long id) {
        this.professores.stream().filter(x-> x.id == id).forEach(System.out::println);
    }
    public boolean existeIdProfessor(long id) {
        for (Professor professor : this.professores) {
            if (professor.getId() == id){
                return true;
            }
        }
        System.out.println("Digite um Id válido.");
        return false;
    }


    //-------------------------------METODOS ALUNO-------------------------------------------
    public void cadastrarAluno(String nome, String cpf, String rg, int idade, String turma, List<Notas> notas) {
        this.alunos.add(new Aluno(nome, cpf, rg, idade, turma, notas));
        System.out.println("Aluno cadastrado!");
    }
    public void listarAlunos(){
        this.alunos.forEach(System.out::println);
    }
    public void atualizarAlunos(long id, String nome, String cpf, String rg, int idade, String turma, List<Notas> notas){
        this.alunos.stream()
                    .filter(x -> x.id == id)
                    .map(x -> x.setIdade(idade).setTurma(turma).setNotas(notas).setNome(nome).setCpf(cpf).setRg(rg))
                    .forEach(System.out::println);
    }
    public void deletarAluno(long id) {
        if (this.alunos.removeIf(x -> x.id == id)){
            System.out.println("Aluno deletado.");
        } else {
            System.out.println("Esse id não existe. Favor usar um id válido.");
        }
    }
    public void buscarAlunoPorID(long id) {
        this.alunos.stream().filter(x-> x.id == id).forEach(System.out::println);
    }
    public boolean existeIdAluno(long id) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getId() == id){
                return true;
            }
        }
        System.out.println("Digite um Id válido.");
        return false;
    }

    public void mediaNotaAluno(long id) {
       List<Notas> notas = this.alunos.get((int)id-1).getNotas();
       double totalMatematica = 0;
       double totalPortugues = 0;

        for (int i = 0; i < notas.size(); i++) {
            totalMatematica += notas.get(i).getNotaMatematica();
            totalPortugues += notas.get(i).getNotaProtugues();
        }
        double mediaMatematica = totalMatematica/ notas.size();
        double mediaPortugues = totalPortugues/ notas.size();
        System.out.println("Média de matemática: " + mediaMatematica + ", Média de português: " + mediaPortugues);
    }
}
