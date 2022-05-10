package Modulo2.aula04;

public class Notas {

    private double notaMatematica;
    private double notaProtugues;
    private double notaQuimica;
    private double notaBiologia;

    public Notas(double notaMatematica, double notaProtugues, double notaQuimica, double notaBiologia) {
        this.notaMatematica = notaMatematica;
        this.notaProtugues = notaProtugues;
        this.notaQuimica = notaQuimica;
        this.notaBiologia = notaBiologia;
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

    public double getNotaQuimica() {
        return notaQuimica;
    }

    public void setNotaQuimica(double notaQuimica) {
        this.notaQuimica = notaQuimica;
    }

    public double getNotaBiologia() {
        return notaBiologia;
    }

    public void setNotaBiologia(double notaBiologia) {
        this.notaBiologia = notaBiologia;
    }
}
