package com.itfrankfurt.spring.controller;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.service.AnimalService;
import com.itfrankfurt.spring.service.AnimalServiceListImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class AnimalController {

//    @Autowired
    private List<Animal> testAnimals;

//    @Autowired
//    @Qualifier("setImpl")
    private AnimalService animalService;

    @Autowired
    public AnimalController(List<Animal> testAnimals, @Qualifier("h2Impl") AnimalService animalService) {
        this.testAnimals = testAnimals;
        this.animalService = animalService;
    }

    public AnimalController() {

    }

    @PostConstruct
    public void postConstruct() {

        testAnimals.stream().forEach(a -> animalService.addAnimal(a));
    }

    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        System.out.println(animalService.getAllAnimals().toString());
        return animalService.getAllAnimals();
    }

    @PostMapping("/animal")
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

//    @PutMapping("/animal/{weight}")
//    public Animal updateWeight(@RequestBody Animal animal, @PathVariable int weight) {
//        db = db.stream().filter(a -> !a.equals(animal)).collect(Collectors.toList());
//        animal.setWeight(weight);
//        db.add(animal);
//        return animal;
//    }

    @DeleteMapping("/animal/{name}")
    public void deleteAnimal(@PathVariable String name) {
        animalService.deleteAnimalByName(name);
    }

    @GetMapping("/animal/{name}")
    public ResponseEntity<Animal> findAnimal(@PathVariable String name) {
        Optional<Animal> first = animalService.getAnimalByName(name);

        return first
                .map(a -> ResponseEntity.ok(a))
                .orElseGet(() -> ResponseEntity.status(404).build());
//        if(first.isPresent()) {
//            return ResponseEntity.ok(first.get());
//        } else {
//            return ResponseEntity.status(404).build();
//        }
    }

    @GetMapping("/animals/{name}/{weight}")
    public List<Animal> findAllByNameAndWeightGreaterThan(@PathVariable String name,@PathVariable int weight) {
        return animalService.getAllByNameAndWeightGreaterThan(name,weight);
    }


}
