package de.berlin.htw.webtech.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
public class FoodSpotsController {

    @Autowired
    FoodSpotService service;


    Logger logger = LoggerFactory.getLogger(FoodSpotsController.class);

    @PostMapping("/FoodSpotsList")
    public FoodSpots createFoodSpot(@RequestBody FoodSpots foodSpots) {
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

   /* @PutMapping("/FoodSpotsList/{id}")
    public ResponseEntity<FoodSpots> updateFoodSpot(@PathVariable String id, @RequestBody FoodSpots foodSpots) {
        Long FoodSpotId = Long.parseLong(id);
        FoodSpots existingFoodSpot = service.get(FoodSpotId);

        if (existingFoodSpot != null) {
            existingFoodSpot.setName(foodSpots.getName());
            existingFoodSpot.setDescription(foodSpots.getDescription());
            // Update other properties as needed

            FoodSpots updatedFoodSpot = service.save(existingFoodSpot);
            return ResponseEntity.ok(updatedFoodSpot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

*/
   @DeleteMapping(path = "/FoodSpotsList/{id}")
   public ResponseEntity<Void> deleteFoodSpot(@PathVariable Long id) {
       boolean successful = service.deleteById(id);
       return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
   }




}

