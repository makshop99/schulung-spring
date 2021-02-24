package com.itfrankfurt.spring.entity;

import java.util.Objects;

public class Animal {
    private String name;
    private int weight;
    private boolean canFly;

    public Animal() {
    }

    public Animal(String name, int weight, boolean canFly) {
        this.name = name;
        this.weight = weight;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && canFly == animal.canFly && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, canFly);
    }
}
