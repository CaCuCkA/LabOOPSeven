package demo.controllers;

import demo.flowers.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower-bucket")
public class FlowerBucketController {
    @GetMapping
    public List<FlowerBucket> flowersInBucket() {
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(new Chamomile(FlowerColor.WHITE, 50, 29));
        bucket.addFlowers(new Rose(FlowerColor.RED, 40, 17));
        bucket.addFlowers(new Tulip(FlowerColor.BLUE, 60, 27));
        return List.of(bucket);
    }
}