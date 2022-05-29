package Modulo3.aula02.classes;

import java.util.ArrayList;
import java.util.List;

public class VersusBoard extends Board{

    private final int MAX_PLAYERS = 2;
    private final int MAX_DECKS = 2;
    private final int NUMBER_OF_CARDS = 50;
    private final int MAX_ATTACK_CARDS_FIELDS = 5;
    private final int MAX_SPECIALATTACK_CARDS_FIELDS = 2;
    private final int INITIAL_LIFEPOINTS = 20;

    private List<boolean[]> fieldsAttackCard = new ArrayList<>();
    private List<boolean[]> fieldsSpecialAttackCard = new ArrayList<>();

    public VersusBoard() {
        for (int i = 0; i < MAX_PLAYERS; i++) {
            this.fieldsAttackCard.add(new boolean[MAX_ATTACK_CARDS_FIELDS]);
            this.fieldsSpecialAttackCard.add(new boolean[MAX_SPECIALATTACK_CARDS_FIELDS]);
        }
    }

    @Override
    public void insertDeck() {
        if (deckCounter < MAX_DECKS){
            this.decks.add(new GenericCard[NUMBER_OF_CARDS]);
            deckCounter ++;
            System.out.println(this.deckCounter +"° deck foi inserido na mesa.");
        } else {
            System.out.println("Todos os decks estão na mesa.");
        }
    }

    @Override
    public void insertPlayer() {
        if (playerCounter < MAX_PLAYERS){
            this.players.add(new Player(INITIAL_LIFEPOINTS));
            playerCounter++;
            System.out.println(this.playerCounter +"° player foi inserido na mesa.");
        } else {
            System.out.println("Todos os players estão na mesa.");
        }
    }

    @Override
    public void playACard(GenericCard card, int numeroDoPlayer) {
        if (card instanceof SpecialAttackCard){
           boolean[] field = this.fieldsSpecialAttackCard.get(numeroDoPlayer - 1);
           if (isThereBlankField(field)){
               System.out.println("Player " + numeroDoPlayer + ": Carta de ataque especial invocada.");
                field[getBlankField(field)] = true;
           }
        } else if (card instanceof AttackCard) {
            boolean[] field = this.fieldsAttackCard.get(numeroDoPlayer - 1);
            if (isThereBlankField(field)) {
                System.out.println("Player " + numeroDoPlayer + ": Carta de ataque invocada.");
                field[getBlankField(field)] = true;
            }
        }
    }

    @Override
    public void checkWinner() {
        int counter = 0;
        int indexWinner = 0;
        for (Player player: this.players) {
            if (player.getLifePoints() == 0){
                counter++;
            }
        }
        if (counter < MAX_PLAYERS-1){
            System.out.println("O jogo ainda não acabou.");
        } else if (counter == MAX_PLAYERS-1) {
            System.out.println("O jogo acabou");
            counter = 0;
            for (Player player: this.players) {
                if (player.getLifePoints() != 0){
                    break;
                }
                counter++;
                indexWinner = counter;
            }
            System.out.println("Vencedor é o player " + indexWinner);
        } else {
            System.out.println("O jogo empatou.");
        }
    }
}
