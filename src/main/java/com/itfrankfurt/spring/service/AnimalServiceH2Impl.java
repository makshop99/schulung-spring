package com.itfrankfurt.spring.service;

import com.itfrankfurt.spring.entity.Animal;
import com.itfrankfurt.spring.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("h2Impl")
public class AnimalServiceH2Impl  implements AnimalService{

    @Autowired
    AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Optional<Animal> getAnimalByName(String name) {
        return animalRepository.findAnimalByName(name);
    }

    @Override
    @Transactional
    public void deleteAnimalByName(String name) {
        animalRepository.deleteAnimalByName(name);
//        deleteFisch();
    }

    @Override
    public List<Animal> getAllByNameAndWeightGreaterThan(String name, int weight) {
        return animalRepository.findAllByNameAndWeightIsGreaterThanOrderByWeight(name, weight);
    }

//    private void deleteFisch() {
//        animalRepository.deleteAnimalByName("Fisch");
//    }
}
