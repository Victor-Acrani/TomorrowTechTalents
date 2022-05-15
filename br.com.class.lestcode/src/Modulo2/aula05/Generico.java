package Modulo2.aula05;

public class Generico {

    protected int pontosDeVida = 100;

    public void atacar(){
        System.out.println("Causou 10 de dano");
    }

    public void apanhar(Ataque ataque){
        this.pontosDeVida -= ataque.getDano();
        System.out.printf("Recebeu %d de dano%n", ataque.getDano());
    }

    public void interagir(){
        System.out.println("Por que eu responderia meu inimigo???");
    }

    public void mostraHpAtual(){
        System.out.println("O Hp atual é " + this.pontosDeVida);
    }

    @Override
    public String toString() {
        return "Info monstro-> { Classe: Generico. Hp atual:"+ this.pontosDeVida + ", Ataque: 10 de dano.}";
    }
}
