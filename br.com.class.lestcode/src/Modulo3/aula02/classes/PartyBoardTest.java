package Modulo3.aula02.classes;

public class PartyBoardTest {

    public static void main(String[] args) {

        PartyBoard partyBoard = new PartyBoard();

        // teste para inserir decks e players
        for (int i = 0; i < 6; i++){
            partyBoard.insertDeck();
            partyBoard.insertPlayer();
        }

        // teste para invocar uma carta de ataque
        for (int i = 0; i < 9; i++) {
            System.out.println("-----------------------------------------");
            partyBoard.playACard(new AttackCard(), 1);
            partyBoard.playACard(new SpecialAttackCard(), 2);
            partyBoard.playACard(new AttackCard(), 3);
            partyBoard.playACard(new SpecialAttackCard(), 4);
        }

        // teste para verificar se há vencedor
        System.out.println("-----------------------------------------");
        partyBoard.checkWinner();
        System.out.println("-----------------------------------------");
        partyBoard.players.get(0).setLifePoints(0);
        partyBoard.players.get(1).setLifePoints(0);
        partyBoard.players.get(2).setLifePoints(0);
        partyBoard.players.get(3).setLifePoints(0);
        partyBoard.checkWinner();
        System.out.println("-----------------------------------------");
        partyBoard.players.get(4).setLifePoints(0);
        partyBoard.checkWinner();
    }
}
