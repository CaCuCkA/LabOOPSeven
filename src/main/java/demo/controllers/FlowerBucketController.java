package demo.controllers;

import demo.flowers.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower-bucket")
public class FlowerBucketController {
    static final double CHAMOMILE_SEPAL_LENGTH = 50;
    static final double ROSE_SEPAL_LENGTH = 40;
    static final double TULIP_SEPAL_LENGTH = 60;

    static final double CHAMOMILE_PRICE = 29;
    static final double ROSE_PRICE = 17;
    static final double TULIP_PRICE = 27;

    @GetMapping
    public List<FlowerBucket> flowersInBucket() {
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(new Chamomile(FlowerColor.WHITE, CHAMOMILE_SEPAL_LENGTH, CHAMOMILE_PRICE));
        bucket.addFlowers(new Rose(FlowerColor.RED, ROSE_SEPAL_LENGTH, ROSE_PRICE));
        bucket.addFlowers(new Tulip(FlowerColor.BLUE, TULIP_SEPAL_LENGTH, TULIP_PRICE));
        return List.of(bucket);
    }
}