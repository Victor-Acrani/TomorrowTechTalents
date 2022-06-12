package Modulo3.aula03.Part1.interfaces;

import Modulo3.aula03.Part1.classes.Item;
import Modulo3.aula03.Part2.interfaces.ICheckAdultItem;

public interface IStockedItem extends ICheckAdultItem {

    int getQuantity();
    void setQuantity(int quantity);
    Item getItem();
    void showStockedItem();
}
