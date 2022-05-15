package Modulo2.aula05;

public class Gigante extends Generico{

    public Gigante() {
        this.pontosDeVida = 300;
    }
    public void atacar(){
        System.out.println("Causou 25 de dano. Seu personagem está atordoado.");
    }

    public void apanhar(Ataque ataque){

        if(ataque.getTipoAtaque().equalsIgnoreCase("fogo")){
            this.pontosDeVida -= ataque.getDano()*2;
            System.out.printf("Ataque super efetivo! Recebeu %d de dano%n", ataque.getDano()*2);
            this.mostraHpAtual();
        } else {
            this.pontosDeVida -= ataque.getDano();
            System.out.printf("Recebeu %d de dano%n", ataque.getDano());
        }
    }

    public void interagir(){
        System.out.println("Me desculpe.");
    }
}
