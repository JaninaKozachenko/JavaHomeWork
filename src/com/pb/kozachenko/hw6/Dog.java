package com.pb.kozachenko.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private String breedOfDog;

    public Dog () {
        super("собака");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("ГАВ");
    }

    @Override
    public void eat () {
        super.eat();
        System.out.println("+ мясо");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(breedOfDog, dog.breedOfDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breedOfDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breedOfDog='" + breedOfDog + '\'' +
                '}';
    }
}
