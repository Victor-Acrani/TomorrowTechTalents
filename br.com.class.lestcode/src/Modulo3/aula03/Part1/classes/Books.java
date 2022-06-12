package Modulo3.aula03.Part1.classes;

import java.util.List;

public class Books extends Item{

    private List<String> genres;
    private String author;
    private String publisher;

    public Books(String name, double price) {
        super(name, price);
    }

    public Books(String name, double price, List<String> genres, String author, String publisher) {
        super(name, price);
        this.genres = genres;
        this.author = author;
        this.publisher = publisher;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String productFullDescription() {
        return "Book{" +
                productInfo()+
                ", genres=" + genres +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public <T extends Item> void update(T item) {
        if (item instanceof Books){
            this.name = item.name;
            this.price = item.price;
            this.genres = ((Books) item).genres;
            this.author = ((Books) item).author;
            this.publisher = ((Books) item).publisher;
            System.out.println("Item updated");
            System.out.println(productFullDescription());
        }
    }

}
