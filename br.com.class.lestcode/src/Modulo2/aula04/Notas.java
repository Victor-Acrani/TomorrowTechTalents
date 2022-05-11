package Modulo2.aula04;

public class Notas {

    private double notaMatematica;
    private double notaProtugues;


    public Notas(double notaMatematica, double notaProtugues) {
        this.notaMatematica = notaMatematica;
        this.notaProtugues = notaProtugues;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    public double getNotaProtugues() {
        return notaProtugues;
    }
    public void setNotaProtugues(double notaProtugues) {
        this.notaProtugues = notaProtugues;
    }

    @Override
    public String toString() {
        return "Matemática: " + this.notaMatematica + ", Português: " + this.notaProtugues;
    }
}
