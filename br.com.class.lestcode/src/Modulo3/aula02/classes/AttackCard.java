package Modulo3.aula02.classes;

import Modulo3.aula02.enums.TypeOfCard;
import Modulo3.aula02.interfaces.IAttackCard;

public class AttackCard extends GenericCard implements IAttackCard {

    private int attackPoints;
    private int defensePoints;

    public AttackCard() {
    }

    public AttackCard(String name, TypeOfCard type, int cost, int attackPoints, int defensePoints) {
        super(name, type, cost);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public TypeOfCard getType() {
        return null;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public int getAttackPoints() {
        return this.attackPoints;
    }

    @Override
    public int getDefensePoints() {
        return this.defensePoints;
    }
}
