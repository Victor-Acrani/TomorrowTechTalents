package Modulo3.aula03.Part1.classes;

import Modulo3.aula03.Part1.interfaces.IStockedItem;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private Long id;
    private static Long idGenerator = 0l;
    private String name;
    protected List<IStockedItem> stockedItems = new ArrayList<>();

    public Stock(String name) {
        idGenerator++;
        this.id = idGenerator;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
