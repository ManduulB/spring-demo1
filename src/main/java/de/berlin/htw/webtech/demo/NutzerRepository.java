package de.berlin.htw.webtech.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutzerRepository extends CrudRepository<Nutzer, Long> { }
