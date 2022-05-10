package Modulo2.aula04;

public class Funcionario extends  Pessoa{

    protected String cargo;
    protected double salario;

    protected static long contadorId = 0l;

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
        contadorId++;
        this.id = contadorId;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario-> {Id: "+ this.id + "Nome: " + this.nome + ", CPF: " + this.cpf + ", RG: " + this.rg
                + ", Cargo: " + this.cargo + ", Salário: " + this.salario + "}";
    }
}
