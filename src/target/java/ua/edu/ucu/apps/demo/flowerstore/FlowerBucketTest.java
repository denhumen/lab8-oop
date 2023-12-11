package ua.edu.ucu.apps.demo.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.demo.flowerstore.flowers.FlowerBucket;
import ua.edu.ucu.apps.demo.flowerstore.flowers.FlowerPack;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Rose;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowers(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.price());
    }
}
