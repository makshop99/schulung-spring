package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("listImpl")
//@Primary
public class AnimalServiceListImpl implements AnimalService {
    List<Animal> db = new ArrayList<>();

    @Override
    public List<Animal> getAllAnimals() {
        return db;
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
                .collect(Collectors.toList());
    }

    @Override
    public List<Animal> getAllByNameAndWeightGreaterThan(String name, int weight) {
        return null;
    }
}
