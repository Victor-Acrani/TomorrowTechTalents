package Modulo3.aula02.classes;

import Modulo3.aula02.enums.TypeOfCard;
import Modulo3.aula02.interfaces.IGenericCard;

public abstract class GenericCard implements IGenericCard {

    protected String name;
    protected TypeOfCard type;
    protected int cost;

    public GenericCard() {
    }

    public GenericCard(String name, TypeOfCard type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }
}
