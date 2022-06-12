package Modulo3.aula03.Part2.interfaces;

import Modulo3.aula03.Part1.interfaces.IStockedItem;
import Modulo3.aula03.Part2.classes.Costumer;

import java.util.List;

public interface IPurchaseValidator {

    boolean checkCostumerData(Costumer costumer);
    List<IStockedItem> validateList(List<IStockedItem> items, Costumer costumer);
}
