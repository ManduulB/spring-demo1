package de.berlin.htw.webtech.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodSpotsController {

    @Autowired
    FoodSpotService service;


    Logger logger = LoggerFactory.getLogger(FoodSpotsController.class);

    @PostMapping("/FoodSpotsList")
    public FoodSpots createFoodSpot(@RequestBody FoodSpots foodSpots){
        return service.save(foodSpots);
    }



    @GetMapping("/FoodSpotsList/{id}")
    public FoodSpots getFoodSpots(@PathVariable String id) {
        logger.info("GET request on route FoodSpots with {}", id);
        Long FoodSpotId = Long.parseLong(id);
        return service.get(FoodSpotId);
    }

    @GetMapping("/FoodSpotsList")
    public List<FoodSpots> getAllFoodSpotsList() {
        return service.getAll();
    }
}

