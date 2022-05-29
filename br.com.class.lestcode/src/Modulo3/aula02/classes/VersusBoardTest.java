package Modulo3.aula02.classes;

public class VersusBoardTest {

    public static void main(String[] args) {

        VersusBoard versusBoard = new VersusBoard();

        // teste para inserir decks e players
        for (int i = 0; i < 3; i++){
            versusBoard.insertDeck();
            versusBoard.insertPlayer();
        }

        // teste para invocar uma carta de ataque
        for (int i = 0; i < 6; i++) {
            System.out.println("-----------------------------------------");
            versusBoard.playACard(new AttackCard(), 1);
        }

        // teste para invocar uma carta de ataque especial
        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------------------------------");
            versusBoard.playACard(new SpecialAttackCard(), 1);
        }

        // teste para verificar se há vencedor
        System.out.println("-----------------------------------------");
        versusBoard.checkWinner();
        System.out.println("-----------------------------------------");
        versusBoard.players.get(0).setLifePoints(0);
        versusBoard.checkWinner();
        System.out.println("-----------------------------------------");
        versusBoard.players.get(1).setLifePoints(0);
        versusBoard.checkWinner();
    }
}
