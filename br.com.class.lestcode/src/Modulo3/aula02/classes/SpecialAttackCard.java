package Modulo3.aula02.classes;

import Modulo3.aula02.enums.SpecialEffects;
import Modulo3.aula02.enums.TypeOfCard;
import Modulo3.aula02.interfaces.ISpecialAttackCard;

public class SpecialAttackCard extends AttackCard implements ISpecialAttackCard {

    private SpecialEffects effect;

    public SpecialAttackCard() {
    }

    public SpecialAttackCard(String name, TypeOfCard type, int cost, int attackPoints, int defensePoints, SpecialEffects effect) {
        super(name, type, cost, attackPoints, defensePoints);
        this.effect = effect;
    }

    @Override
    public SpecialEffects getSpecialEffects() {
        return this.effect;
    }
}
