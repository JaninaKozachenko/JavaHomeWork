package com.pb.kozachenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private int countMouse;
    private String breedOfCat;

    public Cat () {
        super("кот");
    }

    public int getCountMouse() {
        return countMouse;
    }

    public void setCountMouse(int countMouse) {
        this.countMouse = countMouse;
    }

    public String getBreedOfCat() {
        return breedOfCat;
    }

    public void setBreedOfCat(String breedOfCat) {
        this.breedOfCat = breedOfCat;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("МЯУ");
    }
    @Override
    public void eat () {
        super.eat();
        System.out.println("+ молоко");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return countMouse == cat.countMouse &&
                Objects.equals(breedOfCat, cat.breedOfCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countMouse, breedOfCat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "countMouse=" + countMouse +
                ", breedOfCat='" + breedOfCat + '\'' +
                '}';
    }
}
