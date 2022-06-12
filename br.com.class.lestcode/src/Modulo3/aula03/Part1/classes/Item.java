package Modulo3.aula03.Part1.classes;

import Modulo3.aula03.Part1.interfaces.IItem;

public abstract class Item implements IItem{

    protected Long id;
    private static Long idGenerator = 0l;
    protected String name;
    protected double price;

    public Item(String name, double price) {
        idGenerator++;
        this.id = idGenerator;
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String productInfo(){
        return "Info{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                '}';
    }

}
