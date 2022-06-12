package Modulo3.aula03.Part1.classes;

import java.util.List;

public class MusicAlbum extends Item{

    private String band;
    private List<String> genres;
    private List<String> labels;

    public MusicAlbum(String name, double price) {
        super(name, price);
    }

    public MusicAlbum(String name, double price, String band, List<String> genres, List<String> labels) {
        super(name, price);
        this.band = band;
        this.genres = genres;
        this.labels = labels;
    }

    public String getBand() {
        return band;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String productFullDescription() {
        return "MusicAlbum{" +
                productInfo()+
                ", band=" + band +
                ", genres=" + genres +
                ", labels=" + labels +
                '}';
    }

    @Override
    public <T extends Item> void update(T item) {
        if (item instanceof MusicAlbum){
            this.name = item.name;
            this.price = item.price;
            this.band = ((MusicAlbum) item).band;
            this.genres = ((MusicAlbum) item).genres;
            this.labels = ((MusicAlbum) item).labels;
            System.out.println("Item updated");
            System.out.println(productFullDescription());
        }
    }
}
