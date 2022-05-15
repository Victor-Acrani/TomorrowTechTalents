package Modulo2.aula05;

public class Ataque {

    private String tipoAtaque;
    private int dano;

    public Ataque(String tipoAtaque, int dano) {
        this.tipoAtaque = tipoAtaque;
        this.dano = dano;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return "Ataque-> {Tipo: " + this.tipoAtaque + ", Dano: "+ this.dano+"}";
    }
}
