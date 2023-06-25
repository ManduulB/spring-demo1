package de.berlin.htw.webtech.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
//@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NutzerController {

    @Autowired
    NutzerService service;

    Logger logger = LoggerFactory.getLogger(NutzerController.class);


    @GetMapping("/Nutzers")
    public List<Nutzer> getAllNutzers() {
        return service.getAll();
    }


    @PostMapping("/Nutzers")
    public Nutzer createNutzer(@RequestBody Nutzer nutzer) {
        return service.save(nutzer);
    }


    @GetMapping("/Nutzers/{id}")
    public Nutzer getNutzer(@PathVariable String id) {
        logger.info("GET request on route things with {}", id);
        Long nutzerId = Long.parseLong(id);
        return service.get(nutzerId);
    }

}