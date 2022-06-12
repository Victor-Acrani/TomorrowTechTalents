package Modulo3.aula03.Part1.classes;

import Modulo3.aula03.Part1.interfaces.IStockManager;
import Modulo3.aula03.Part1.interfaces.IStockedItem;

import java.util.List;

public class StockManager implements IStockManager {

    private Stock stock;

    public StockManager(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void addItem(Item item, int quantity) {
        stock.stockedItems.add(new StockedItem(item, quantity));
    }

    @Override
    public void addItem(IStockedItem item) {
        stock.stockedItems.add(item);
    }

    @Override
    public void addItems(List<IStockedItem> items) {
        for (IStockedItem item : items) {
            addItem(item);
        }
    }

    @Override
    public void deleteItem(Long id) {
        IStockedItem itemToDelete = null;

        if (isItemInStock(id)){
            for (IStockedItem item : stock.stockedItems) {
                if (item.getItem().getId() == id){
                    itemToDelete = item;
                    break;
                }
            }
        }
        stock.stockedItems.remove(itemToDelete);
    }

    @Override
    public void updateItemQuantity(Long id, int quantity) {
        if (isItemInStock(id)){
            for (IStockedItem item : stock.stockedItems) {
                if (item.getItem().getId() == id){
                    item.setQuantity(quantity);
                }
            }
        }
    }

    @Override
    public void listItems() {
        stock.stockedItems.forEach(x-> x.showStockedItem());
    }

    @Override
    public void listItemsByType() {
        System.out.println("---BOOKS---");
        stock.stockedItems.stream().
                filter(x -> x.getItem() instanceof Books).forEach(x -> x.showStockedItem());
        System.out.println("---GAMES---");
        stock.stockedItems.stream().
                filter(x -> x.getItem() instanceof Games).forEach(x -> x.showStockedItem());
        System.out.println("---MOVIES---");
        stock.stockedItems.stream().
                filter(x -> x.getItem() instanceof Movies).forEach(x -> x.showStockedItem());
        System.out.println("---MUSIC ALBUMS---");
        stock.stockedItems.stream().
                filter(x -> x.getItem() instanceof MusicAlbum).forEach(x -> x.showStockedItem());
        System.out.println("---TOYS---");
        stock.stockedItems.stream().
                filter(x -> x.getItem() instanceof Toy).forEach(x -> x.showStockedItem());
    }

    @Override
    public boolean isItemInStock(Long id) {
        for (IStockedItem st : stock.stockedItems) {
            if (st.getItem().getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public StockedItem getItemFromStock(Long id, int quantity) {
        if (isItemInStock(id)){
            for (IStockedItem item : stock.stockedItems) {
                if (item.getItem().getId() == id){
                    StockedItem stockedItem = new StockedItem(item.getItem(), quantity);
                    if (item.getIsAdultItem()){
                        stockedItem.setIsAdultItem(true);
                    }
                    return stockedItem;
                }
            }
        }
        return null;
    }

    @Override
    public IStockedItem findItemInStock(Long id) {
        for (IStockedItem item : stock.stockedItems) {
            if (item.getItem().getId() == id){
                return item;
            }
        }
        return null;
    }

}
