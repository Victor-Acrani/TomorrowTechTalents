package Modulo2.aula05;

public class TestaMonstros {

    public void testaDinamicaMonstro(Generico monstro, Ataque ataque){
        if (monstro instanceof Vampiro){
            monstro.mostraHpAtual();
            monstro.interagir();
            ((Vampiro) monstro).atacar();
            monstro.apanhar(ataque);
        } else if (monstro instanceof Cobra) {
            monstro.mostraHpAtual();
            monstro.interagir();
            ((Cobra) monstro).atacar();
            monstro.apanhar(ataque);
        } else if (monstro instanceof Gigante) {
            monstro.mostraHpAtual();
            monstro.interagir();
            ((Gigante) monstro).atacar();
            monstro.apanhar(ataque);
        } else {
            monstro.mostraHpAtual();
            monstro.interagir();
            monstro.atacar();
            monstro.apanhar(ataque);
        }
    }
}
