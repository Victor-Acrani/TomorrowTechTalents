package Modulo3.aula02.interfaces;

import Modulo3.aula02.classes.GenericCard;

public interface IBoard {

    void insertDeck();
    void insertPlayer();
    void playACard(GenericCard card, int numeroDoPlayer);

    void checkWinner();

}
