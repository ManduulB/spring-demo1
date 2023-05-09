package de.berlin.htw.webtech.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutzerController {

    @Autowired
    NutzerService service;

    Logger logger = LoggerFactory.getLogger(NutzerController.class);

    @PostMapping("/Nutzers")
    public Nutzer createNutzer(@RequestBody Nutzer nutzer){
        return service.save(nutzer);
    }

    //GetMapper mit Nutzer und der ID hinz

    //noch ein GetMapper vom Array hinz.
}
