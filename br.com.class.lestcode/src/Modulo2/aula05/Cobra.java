package Modulo2.aula05;

public class Cobra extends Generico {

    public Cobra() {
        this.pontosDeVida = 200;
    }
    public void atacar(){
        System.out.println("Causou 10 de dano. Seu personagem está envenenado.");
    }

    public void apanhar(Ataque ataque){

        if(ataque.getTipoAtaque().equalsIgnoreCase("pancada")){
            this.pontosDeVida -= ataque.getDano()*2;
            System.out.printf("Ataque super efetivo! Recebeu %d de dano%n", ataque.getDano()*2);
            this.mostraHpAtual();
        } else {
            this.pontosDeVida -= ataque.getDano();
            System.out.printf("Recebeu %d de dano%n", ataque.getDano());
        }
    }

    public void interagir(){
        System.out.println("Se você acender a chama a maldição acaba.");
    }
}
