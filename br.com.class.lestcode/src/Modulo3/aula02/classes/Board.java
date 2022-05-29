package Modulo3.aula02.classes;

import Modulo3.aula02.interfaces.IBoard;

import java.util.ArrayList;
import java.util.List;

public abstract class Board implements IBoard {

    protected int playerCounter = 0;
    protected int deckCounter = 0;
    protected List<GenericCard[]> decks = new ArrayList<>();
    protected List<Player> players= new ArrayList<>();

    protected boolean isThereBlankField(boolean[] fields){
        for (boolean field: fields) {
            if (!field){
                return true;
            }
        }
        System.out.println("Não existe espaço vazio.");
        return false;
    }

    protected int getBlankField(boolean[] fields){
        int counter = 0;
        for (boolean field: fields) {
            if (!field){
                System.out.println((counter+1) + "°posição está disponível.");
                break;
            }
            counter++;
        }
        return counter;
    }
}
