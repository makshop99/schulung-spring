package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalService {
    List<Animal> getAllAnimals();
    Animal addAnimal(Animal animal);
    Optional<Animal> getAnimalByName(String name);
    void deleteAnimalByName(String name);
    List<Animal> getAllByNameAndWeightGreaterThan(String name, int weight);
}
