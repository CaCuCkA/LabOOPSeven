package demo.controllers;

import demo.flowers.Chamomile;
import demo.flowers.Flower;
import demo.flowers.FlowerColor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    static final double CHAMOMILE_SEPAL_LENGTH = 50;
    static final double CHAMOMILE_PRICE = 100;

    @GetMapping
    public List<Flower> flowers() {
        return List.of(new Chamomile(FlowerColor.WHITE, CHAMOMILE_SEPAL_LENGTH, CHAMOMILE_PRICE));
    }
}