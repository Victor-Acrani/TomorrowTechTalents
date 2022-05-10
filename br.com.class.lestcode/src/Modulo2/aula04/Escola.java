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
    }

    public void listarFuncionario(){
        this.funcionarios.stream().forEach(x -> System.out.println(x));
    }

    public void atualizarFuncionario(long id, String nome, String cpf, String rg, String cargo, double salario){
        this.funcionarios.stream()
                .filter(x -> x.id == id)
                .map(x -> x.setNome(nome));

    }


}
