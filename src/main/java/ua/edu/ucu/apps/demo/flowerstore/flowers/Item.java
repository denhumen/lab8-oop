package ua.edu.ucu.apps.demo.flowerstore.flowers;

public abstract class Item {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
