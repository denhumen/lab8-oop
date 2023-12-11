package ua.edu.ucu.apps.demo.flowerstore.flowers;

import lombok.Getter;

import java.util.ArrayList;

public class Store {
    @Getter
    private ArrayList<FlowerBucket> bucketsList = new ArrayList<FlowerBucket>();

    public void addBucket(FlowerBucket bucket) {
        bucketsList.add(bucket);
    }

    public ArrayList search(Flower targetFlower) {
        ArrayList<FlowerBucket> desirableBuckets = new ArrayList<>();
        for (FlowerBucket bucket : bucketsList) {
            for (FlowerPack pack : bucket.getPackList()) {
                if (pack.getFlower().getFlowerType() == targetFlower.getFlowerType()) {
                    desirableBuckets.add(bucket);
                    break;
                }
            }
        }
        return desirableBuckets;
    }
}
