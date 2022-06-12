package Modulo3.aula03.Part1.classes;

import Modulo3.aula03.Part1.interfaces.ICashier;
import Modulo3.aula03.Part1.interfaces.IStockedItem;
import Modulo3.aula03.Part2.classes.Costumer;
import Modulo3.aula03.Part2.interfaces.IDiscount;
import Modulo3.aula03.Part2.interfaces.IPurchaseValidator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Cashier implements ICashier, IPurchaseValidator, IDiscount {

    private Long id;
    private static Long idGenerator = 0l;
    private double cash;
    private StockManager stockManager;

    public Cashier(StockManager stockManager) {
        idGenerator++;
        this.id = idGenerator;
        this.cash = 1000.0;
        this.stockManager = stockManager;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public double getCash() {
        return cash;
    }

    @Override
    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public double calculateBill(List<IStockedItem> items) {
        double bill = 0;
        for (IStockedItem item : items) {
            bill += item.getItem().getPrice() * item.getQuantity();
            System.out.println("You bought: " + item.getQuantity() + "x " + item.getItem().getName());
            int currentQuantity = stockManager.findItemInStock(item.getItem().getId()).getQuantity() - item.getQuantity();
            stockManager.findItemInStock(item.getItem().getId()).setQuantity(currentQuantity);
        }
        return bill;
    }

    @Override
    public void chargeCostumer(double bill) {
        System.out.println("Total bill: $" + bill);
    }

    @Override
    public void updateCashierCash(double cash) {
        this.cash += cash;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", cash=" + cash +
                '}';
    }

    @Override
    public double checkBookDiscount(List<IStockedItem> items, double bill) {
        double totalBookValue = 0;
        double bookDiscount = 0.15;

        for (IStockedItem item : items) {
            if (item.getItem() instanceof Books){
                totalBookValue = item.getItem().getPrice() * item.getQuantity();
            }
        }
        if (totalBookValue > 200){
            System.out.println("Applied book discount: $" + (bill*bookDiscount));
            return bill*bookDiscount;
        }
        return 0;
    }

    @Override
    public boolean checkCostumerData(Costumer costumer) {
        LocalDate today = LocalDate.now();
        long years = ChronoUnit.YEARS.between(costumer.getBirthDay(), today);
        System.out.println("Idade do compreador " + years);
        if (years >= 18){
            return true;
        }
        return false;
    }

    @Override
    public List<IStockedItem> validateList(List<IStockedItem> items, Costumer costumer) {
        List<IStockedItem> validatedList = new ArrayList<>();
        for (IStockedItem item : items) {
            if (item.getIsAdultItem()){
                if (checkCostumerData(costumer)){
                    validatedList.add(item);
                } else {
                    System.out.println("Costumer not allowed to buy: " + item.getItem().productInfo());
                }
            } else {
                validatedList.add(item);
            }
        }
        return validatedList;
    }

}
