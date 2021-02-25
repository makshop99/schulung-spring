package com.itfrankfurt.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int weight;
    private boolean canFly;

    public Animal(String name, int weight, boolean canFly) {
        this.name = name;
        this.weight = weight;
        this.canFly = canFly;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Animal() {
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isCanFly() {
        return this.canFly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Animal)) return false;
        final Animal other = (Animal) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getWeight() != other.getWeight()) return false;
        if (this.isCanFly() != other.isCanFly()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Animal;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getWeight();
        result = result * PRIME + (this.isCanFly() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Animal(name=" + this.getName() + ", weight=" + this.getWeight() + ", canFly=" + this.isCanFly() + ")";
    }
}
