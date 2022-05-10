package Modulo2.aula04;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Professor> professors = new ArrayList<Professor>();
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Escola(){

    }

    public void cadastrarFuncionario(String nome, String cpf, String rg, String cargo, double salario){
        this.funcionarios.add(new Funcionario(nome, cpf, rg, cargo, salario));
        System.out.println("Funcionário cadastrado!");
    }

    public void listarFuncionario(){
        this.funcionarios.stream().forEach(x -> System.out.println(x));
    }

    public void atualizarFuncionario(long id, String nome, String cpf, String rg, String cargo, double salario){

    }

    public void deletarFuncionario(long id){
       if (this.funcionarios.removeIf(x-> x.id == id)){
           System.out.println("Funcionário deletado.");
       } else {
           System.out.println("Esse id não existe. Favor usar um id válido.");
       }
    }

}
