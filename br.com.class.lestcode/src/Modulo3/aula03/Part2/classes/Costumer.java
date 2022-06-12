package Modulo3.aula03.Part2.classes;

import Modulo3.aula03.Part2.interfaces.ICostumer;

import java.time.LocalDate;

public class Costumer implements ICostumer {

    private String name;
    private String rg;
    private String cpf;
    private LocalDate birthDay;

    public Costumer(String name, String rg, String cpf, LocalDate birthDay) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public LocalDate getBirthDay() {
        return birthDay;
    }
}
