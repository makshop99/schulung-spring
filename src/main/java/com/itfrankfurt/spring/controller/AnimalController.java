package com.itfrankfurt.spring.controller;

import com.itfrankfurt.spring.entity.Animal;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class AnimalController {
    List<Animal> db = new ArrayList<>();

    public AnimalController(){
        db.add(new Animal("Vogel",1, true));
        db.add(new Animal("Fisch",5, false));
        db.add(new Animal("Löwe",100, false));
    }

    @GetMapping("/animals")
    public List<Animal> getAllAnimals(){
        return db;
    }

    @PostMapping("/animal")
    public Animal createAnimal(@RequestBody Animal animal) {
        db.add(animal);
        return animal;
    }

    @PutMapping("/animal/{weight}")
    public Animal updateWeight(@RequestBody Animal animal, @PathVariable int weight) {
        db = db.stream().filter(a -> !a.equals(animal)).collect(Collectors.toList());
        animal.setWeight(weight);
        db.add(animal);
        return animal;
    }

    @DeleteMapping("/animal/{name}")
    public void deleteAnimal(@PathVariable String name) {
        db = db.stream()
                .filter(animal -> !animal.getName().equals(name))
                .collect(Collectors.toList());
    }

    @GetMapping("/animal/{name}")
    public ResponseEntity<Animal> findAnimal(@PathVariable String name) {
        Optional<Animal> first = db.stream()
                .filter(a -> a.getName().equals(name))
                .findFirst();

        return first
                .map( a -> ResponseEntity.ok(a))
                .orElseGet(() -> ResponseEntity.status(404).build());
//        if(first.isPresent()) {
//            return ResponseEntity.ok(first.get());
//        } else {
//            return ResponseEntity.status(404).build();
//        }
    }



}
