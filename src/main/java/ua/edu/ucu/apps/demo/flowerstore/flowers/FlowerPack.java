package ua.edu.ucu.apps.demo.flowerstore.flowers;

import lombok.Getter;

public class FlowerPack extends Item {
    @Getter
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double price() {
        return flower.price() * quantity;
    }
}
