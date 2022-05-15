package Modulo2.aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TestaMonstros testaMontro = new TestaMonstros();

        Generico monstroGenerico = new Generico();
        Vampiro vampiro = new Vampiro();
        Cobra cobra = new Cobra();
        Gigante gigante = new Gigante();

        Ataque ataqueNormal = new Ataque("normal", 5);
        Ataque ataquePerfurante = new Ataque("perfurante", 10);
        Ataque ataquePancada = new Ataque("pancada", 7);
        Ataque ataqueDeFogo = new Ataque("fogo",20);
        List<Ataque> listaAtaques = Collections.EMPTY_LIST;
        Collections.addAll(listaAtaques = new ArrayList<Ataque>(), ataqueNormal, ataquePerfurante, ataquePancada, ataqueDeFogo);

        listaAtaques.forEach(System.out::println);

        System.out.println("-------------MONSTRO GENERICO-------------");
        listaAtaques.forEach(x-> {
            testaMontro.testaDinamicaMonstro(monstroGenerico,x);
            System.out.println();});

        System.out.println("-------------VAMPIRO-------------");
        listaAtaques.forEach(x-> {
            testaMontro.testaDinamicaMonstro(vampiro,x);
            System.out.println();});

        System.out.println("-------------COBRA-------------");
        listaAtaques.forEach(x-> {
            testaMontro.testaDinamicaMonstro(cobra,x);
            System.out.println();});

        System.out.println("-------------GIGANTE-------------");
        listaAtaques.forEach(x-> {
            testaMontro.testaDinamicaMonstro(gigante,x);
            System.out.println();});
    }
}
