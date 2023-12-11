package ua.edu.ucu.apps.demo.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(double sepalLength,
                  FlowerColor color,
                  double price,
                  FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower() {
        this.sepalLength = 0;
        this.color = null;
        this.price = 0;
        this.flowerType = null;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return price;
    }
}
