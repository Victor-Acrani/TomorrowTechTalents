package Modulo3.aula03.Part2;

import Modulo3.aula03.Part1.classes.*;
import Modulo3.aula03.Part1.interfaces.IStockedItem;
import Modulo3.aula03.Part2.classes.Costumer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookstorePart2 {

    public static void main(String[] args) {

        Books book = new Books("Game of Thrones", 100);
        Games game = new Games("Catan", 300.0);
        Movies movie = new Movies("Xavier Videos - You know what i mean", 30.0);
        MusicAlbum musicCd = new MusicAlbum("Killswitch Engage - Reincarnate", 55);
        Toy toy = new Toy("Max Steel", 250);
        List<Item> listOfItems = Arrays.asList(book, game, movie, musicCd, toy);

        ItemManager itemManager = new ItemManager();
        itemManager.addItem(listOfItems);
        itemManager.listAllRegisteredItems();
        System.out.println("------------------BREAK LINE----------------");

        IStockedItem item1 = new StockedItem(false, book,100);
        IStockedItem item2 = new StockedItem(false, game,100);
        IStockedItem item3 = new StockedItem(true, movie,100);
        IStockedItem item4 = new StockedItem(false, musicCd,100);
        IStockedItem item5 = new StockedItem(false, toy,100);

        Stock stock = new Stock("Stock1");
        StockManager stockManager = new StockManager(stock);
        stockManager.addItems(Arrays.asList(item1, item2, item3, item4, item5));

        Costumer costumer1 = new Costumer("joao", "13254","44454", LocalDate.of(1995,2,10));
        Costumer costumer2 = new Costumer("bob", "84564","21634", LocalDate.of(2010,5,18));

        List<IStockedItem> buyList = new ArrayList<>(
                Arrays.asList(
                        stockManager.getItemFromStock(1L,5),
                        stockManager.getItemFromStock(2L,5),
                        stockManager.getItemFromStock(3L,5),
                        stockManager.getItemFromStock(4L,5),
                        stockManager.getItemFromStock(5L,5)
                ));

        Cashier cashier = new Cashier(stockManager);
        stockManager.listItemsByType();
        System.out.println("------------------BREAK LINE----------------");
        double bill1 = cashier.calculateBill(cashier.validateList(buyList,costumer1));
        bill1 -= cashier.checkBookDiscount(buyList, bill1);
        cashier.chargeCostumer(bill1);
        cashier.updateCashierCash(bill1);
        stockManager.listItemsByType();
        System.out.println("------------------BREAK LINE----------------");
        double bill2 = cashier.calculateBill(cashier.validateList(buyList,costumer2));
        bill2 -= cashier.checkBookDiscount(buyList, bill2);
        cashier.chargeCostumer(bill2);
        cashier.updateCashierCash(bill2);
        stockManager.listItemsByType();
    }
}
