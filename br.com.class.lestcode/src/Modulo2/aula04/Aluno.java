package Modulo2.aula04;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    protected int idade;
    protected String turma;
    protected List<Notas> notas = new ArrayList<>();
    protected static long contadoId = 0;

    public Aluno() {

    }
    public Aluno(String nome, String cpf, String rg, int idade, String turma, List<Notas> notas) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notas = notas;
        contadoId++;
        this.id = contadoId;
    }
    public Aluno setIdade(int idade) {
        this.idade = idade;
        return this;
    }
    public Aluno setTurma(String turma) {
        this.turma = turma;
        return this;
    }
    public Aluno setNotas(List<Notas> notas) {
        this.notas = notas;
        return this;
    }

    public List<Notas> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Aluno-> {Id: "+ this.id + ", Nome: " + this.nome + ", CPF: " + this.cpf + ", RG: " + this.rg
                + ", Idade: " + this.idade + ", Turma: " + this.turma + ", Notas: ->{" + this.notas + "}}";
    }
}
