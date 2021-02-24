package com.itfrankfurt.spring.config;


import com.itfrankfurt.spring.entity.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AnimalConfig {

    @Bean
    public String mySecretPassword(){
        return "abc123";
    }

    @Bean
    public List<Animal> testAnimals() {
        List<Animal> db = new ArrayList<>();
        db.add(new Animal("Vogel",1, true));
        db.add(new Animal("Fisch",5, false));
        db.add(new Animal("Löwe",100, false));
        return db;
    }
}
