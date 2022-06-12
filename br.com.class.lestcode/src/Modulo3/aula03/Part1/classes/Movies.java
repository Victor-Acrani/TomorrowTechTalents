package Modulo3.aula03.Part1.classes;

import java.util.List;

public class Movies extends Item{

    private String studio;
    private List<String> directors;
    private List<String> genres;
    private List<String> producers;

    public Movies(String name, double price) {
        super(name, price);
    }

    public Movies(String name, double price, String studio, List<String> directors, List<String> genres, List<String> producers) {
        super(name, price);
        this.studio = studio;
        this.directors = directors;
        this.genres = genres;
        this.producers = producers;
    }

    public String getStudio() {
        return studio;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setProducers(List<String> producers) {
        this.producers = producers;
    }

    @Override
    public String productFullDescription() {
        return "Movie{" +
                productInfo()+
                ", studio=" + studio +
                ", directors=" + directors +
                ", genres=" + genres +
                ", producers=" + producers +
                '}';
    }

    @Override
    public <T extends Item> void update(T item) {
        if (item instanceof Movies){
            this.name = item.name;
            this.price = item.price;
            this.studio = ((Movies) item).studio;
            this.directors = ((Movies) item).directors;
            this.genres = ((Movies) item).genres;
            this.producers = ((Movies) item).producers;
            System.out.println("Item updated");
            System.out.println(productFullDescription());
        }
    }
}
