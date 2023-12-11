package ua.edu.ucu.apps.demo.flowerstore.flowers;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    @Getter
    private ArrayList<FlowerPack> packList = new ArrayList<FlowerPack>();
    private double price;

    public FlowerBucket() {
        price = 0;
    }

    public void addFlowers(FlowerPack pack) {
        packList.add(pack);
    }

    @Override
    public double price() {
        price = 0;
        for (FlowerPack pack : packList) {
            price += pack.price();
        }
        return price;
    }
}
