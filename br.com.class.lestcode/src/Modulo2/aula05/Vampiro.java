package Modulo2.aula05;

public class Vampiro extends Generico {

    public Vampiro(){
        this.pontosDeVida = 500;
    }
    public void atacar(){
        System.out.println("Causou 20 de dano. Seu personagem está sangrando.");
    }

    public void apanhar(Ataque ataque){

        if(ataque.getTipoAtaque().equalsIgnoreCase("perfurante")){
            this.pontosDeVida -= ataque.getDano()*2;
            System.out.printf("Ataque super efetivo! Recebeu %d de dano%n", ataque.getDano()*2);
            this.mostraHpAtual();
        } else {
            this.pontosDeVida -= ataque.getDano();
            System.out.printf("Recebeu %d de dano%n", ataque.getDano());
        }
    }

    public void interagir(){
        System.out.println("O que é um homem?");
    }
}
