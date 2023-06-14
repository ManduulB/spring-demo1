package de.berlin.htw.webtech.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodSpotService {

    @Autowired
    FoodSpotsRepository repo;

    public FoodSpots save(FoodSpots foodspots) {
        return repo.save(foodspots);
    }

    public FoodSpots get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<FoodSpots> getAll() {
        Iterable<FoodSpots> iterator = repo.findAll();
        List<FoodSpots> FoodSpotsList = new ArrayList<FoodSpots>();
        for (FoodSpots foodspot : iterator)  FoodSpotsList.add(foodspot);
        return FoodSpotsList;
    }

}