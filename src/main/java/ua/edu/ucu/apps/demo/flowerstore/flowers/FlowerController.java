package ua.edu.ucu.apps.demo.flowerstore.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        final int LENGTH = 4, PRICE = 10;
        return List.of(
                new Flower(LENGTH, FlowerColor.RED, PRICE, FlowerType.ROSE),
                new Flower(LENGTH, FlowerColor.BLUE, PRICE, FlowerType.TULIP));
    }
}