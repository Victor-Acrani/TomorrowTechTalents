package Modulo3.aula03.Part1;

import Modulo3.aula03.Part1.classes.*;
import Modulo3.aula03.Part1.interfaces.IStockedItem;

import java.util.Arrays;
import java.util.List;

public class BookstoreTestPart1 {

    public static void main(String[] args) {
        //teste para criar itens
        Books book = new Books("Game of Thrones", 100);
        Games game = new Games("Catan", 300.0);
        Movies movie = new Movies("Lord of the Ring: The return of the king.", 30.0);
        MusicAlbum musicCd = new MusicAlbum("Killswitch Engage - Reincarnate", 55);
        Toy toy = new Toy("Max Steel", 250);

        List<Item> listOfItems = Arrays.asList(book, game, movie, musicCd, toy);

        // teste das funções do itemManager
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(book);
        itemManager.showItem(1L);
        System.out.println("------------------BREAK LINE----------------");
        itemManager.addItem(listOfItems); // O item book não deve ser inserido mais de uma vez
        itemManager.listAllRegisteredItems();
        System.out.println("------------------BREAK LINE----------------");
        itemManager.deleteItem(1L);
        itemManager.listAllRegisteredItems();
        System.out.println("------------------BREAK LINE----------------");
        itemManager.updateItem(5L, new Toy("HotWheels - Ferrari Spider", 300, "car miniature"));

        // teste das funções do estoque
        Stock stock = new Stock("local stok");
        StockManager stockManager = new StockManager(stock);
        System.out.println("------------------BREAK LINE----------------");
        System.out.println(stock);
        stockManager.addItem(itemManager.getRegisteredItem(2L),10);
        stockManager.addItem(itemManager.getRegisteredItem(3L),20);
        stockManager.addItem(itemManager.getRegisteredItem(4L),30);
        stockManager.addItem(itemManager.getRegisteredItem(5L),40);
        stockManager.listItems();
        System.out.println("------------------BREAK LINE----------------");
        stockManager.deleteItem(2L);
        stockManager.listItems();
        System.out.println("------------------BREAK LINE----------------");
        stockManager.updateItemQuantity(3L,50);
        stockManager.listItemsByType();

        // teste cashier
        Cashier cashier = new Cashier(stockManager);
        System.out.println("------------------BREAK LINE----------------");
        StockedItem item1 = stockManager.getItemFromStock(3L, 1);
        StockedItem item2 = stockManager.getItemFromStock(4L, 15);
        StockedItem item3 = stockManager.getItemFromStock(5L, 20);

        List<IStockedItem> itemsToBuy = Arrays.asList(item1, item2, item3);
        double bill = cashier.calculateBill(itemsToBuy);
        cashier.updateCashierCash(bill);
        cashier.chargeCostumer(bill);
        System.out.println("Current cash: $" + cashier.getCash());
        System.out.println("------------------BREAK LINE----------------");
        stockManager.listItemsByType();
    }
}
