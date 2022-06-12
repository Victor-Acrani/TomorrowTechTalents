package Modulo3.aula03.Part1.classes;

public class Games extends Item{

    private String distributor;
    private String genre;
    private String studio;

    public Games(String name, double price) {
        super(name, price);
    }

    public Games(String name, double price, String distributor, String genre, String studio) {
        super(name, price);
        this.distributor = distributor;
        this.genre = genre;
        this.studio = studio;
    }

    public String getDistribuitor() {
        return distributor;
    }

    public String getGenre() {
        return genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setDistribuitor(String distribuitor) {
        this.distributor = distributor;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String productFullDescription() {
        return "Game{" +
                productInfo()+
                ", distributor=" + distributor +
                ", genre=" + genre +
                ", studio=" + studio +
                '}';
    }

    @Override
    public <T extends Item> void update(T item) {
        if (item instanceof Games){
            this.name = item.name;
            this.price = item.price;
            this.distributor = ((Games) item).distributor;
            this.genre = ((Games) item).genre;
            this.studio = ((Games) item).studio;
            System.out.println("Item updated");
            System.out.println(productFullDescription());
        }
    }
}
