package de.berlin.htw.webtech.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NutzerService {

    @Autowired
    NutzerRepository repo;

    public Nutzer save(Nutzer nutzer) {
        return repo.save(nutzer);
    }

    public Nutzer get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Nutzer> getAll() {
        Iterable<Nutzer> iterator = repo.findAll();
        List<Nutzer> Nutzers = new ArrayList<Nutzer>();
        for (Nutzer nutzer : iterator)  Nutzers.add(nutzer);
        return Nutzers;
    }
}
