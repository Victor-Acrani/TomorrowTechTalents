package Modulo3.aula02.classes;

public class PartyBoard extends Board {

    private final int MAX_PLAYERS = 5;
    private final int MAX_DECKS = 5;
    private final int NUMBER_OF_CARDS = 80;
    private final int INITIAL_LIFEPOINTS = 40;

    private boolean[] field = new boolean[34];

    public PartyBoard() {
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
        if (isThereBlankField(this.field)){
            this.field[getBlankField(this.field)] = true;
            System.out.println("Player " + numeroDoPlayer + (card instanceof SpecialAttackCard ?
                    ": Carta de ataque especial invocada." : ": Carta de ataque invocada."));
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
            System.out.println("Vencedor é o player " + (indexWinner+1));
        } else {
            System.out.println("O jogo empatou.");
        }
    }
}
