package Modulo2.aula04;

public class Professor extends Pessoa{

    private int turmas;
    private int disciplinas;

    public Professor(String nome, String cpf, String rg, int turmas, int disciplinas) {
        super(nome, cpf, rg);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public int getTurmas() {
        return turmas;
    }

    public void setTurmas(int turmas) {
        this.turmas = turmas;
    }

    public int getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int disciplinas) {
        this.disciplinas = disciplinas;
    }
}
