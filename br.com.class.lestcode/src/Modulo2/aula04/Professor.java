package Modulo2.aula04;

public class Professor extends Funcionario{

    private int turmas;
    private int disciplinas;
    protected static long contadorId = 0l;

    public Professor(){

    }
    public Professor(String nome, String cpf, String rg, double salario, int turmas, int disciplinas) {
        super(nome, cpf, rg, "professor", salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
        contadorId++;
        this.id = contadorId;
    }

    public Professor setTurmas(int turmas) {
        this.turmas = turmas;
        return this;
    }

    public Professor setDisciplinas(int disciplinas) {
        this.disciplinas = disciplinas;
        return this;
    }

    @Override
    public String toString() {
        return "Professor-> {Id: "+ this.id + ", Nome: " + this.nome + ", CPF: " + this.cpf + ", RG: " + this.rg
                + ", Cargo: " + this.cargo + ", Turmas: "+ this.turmas + ", Disciplinas: " + this.disciplinas + ", Salário: " + this.salario + "}";
    }
}
