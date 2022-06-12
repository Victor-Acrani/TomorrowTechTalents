package Modulo3.aula03.Part1.classes;

public class Toy extends Item{

    private String type;

    public Toy(String name, double price) {
        super(name, price);
    }

    public Toy(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String productFullDescription() {
        return "Toy{" +
                productInfo()+
                ", type=" + type +
                '}';
    }

    @Override
    public <T extends Item> void update(T item) {
        if (item instanceof Toy){
            this.name = item.name;
            this.price = item.price;
            this.type = ((Toy) item).type;
            System.out.println("Item updated");
            System.out.println(productFullDescription());
        }
    }
}
