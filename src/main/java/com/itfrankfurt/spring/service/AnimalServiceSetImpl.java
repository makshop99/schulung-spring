package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("setImpl")
public class AnimalServiceSetImpl implements AnimalService {
    Set<Animal> db = new HashSet<>();

    @Override
    public List<Animal> getAllAnimals() {

        return new ArrayList<>(db);
    }

    @Override
    public Animal addAnimal(Animal animal) {
        db.add(animal);
        return animal;
    }

    @Override
    public Optional<Animal> getAnimalByName(String name) {
        return db.stream()
                .filter(a -> a.getName().equals(name))
                .findFirst();
    }

    @Override
    public void deleteAnimalByName(String name) {
        db = db.stream()
                .filter(animal -> !animal.getName().equals(name))
                .collect(Collectors.toSet());
    }

    @Override
    public List<Animal> getAllByNameAndWeightGreaterThan(String name, int weight) {
        return null;
    }
}
