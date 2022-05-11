package Modulo2.aula04;

public class Pessoa {

    protected long id;

    protected String nome;
    protected String cpf;
    protected String rg;

    public Pessoa(){

    }

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoa setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getRg() {
        return rg;
    }

    public Pessoa setRg(String rg) {
        this.rg = rg;
        return this;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pessoa-> {Nome: " + this.nome + ", CPF: " + this.cpf + ", RG: " + this.rg + "}";
    }
}
