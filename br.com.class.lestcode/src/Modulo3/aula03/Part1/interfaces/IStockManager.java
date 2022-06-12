package Modulo3.aula03.Part1.interfaces;

import Modulo3.aula03.Part1.classes.Item;

import java.util.List;

public interface IStockManager {

    void addItem(Item item, int quantity);

    void addItem(IStockedItem item);

    void addItems(List<IStockedItem> items);

    void deleteItem(Long id);
    void updateItemQuantity(Long id, int quantity);
    void listItems();
    void listItemsByType();
    boolean isItemInStock(Long id);
    IStockedItem getItemFromStock(Long id, int quantity);
    IStockedItem findItemInStock(Long id);
}
