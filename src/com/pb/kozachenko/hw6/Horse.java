package com.pb.kozachenko.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String breedOfHorse;
    private int speed;

    public Horse () {
        super("лошадь");
    }

    public String getBreedOfHorse() {
        return breedOfHorse;
    }

    public void setBreedOfHorse(String breedOfHorse) {
        this.breedOfHorse = breedOfHorse;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("ИГОГО");
    }
    @Override
    public void eat () {
        super.eat();
        System.out.println("+ зерно");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return speed == horse.speed &&
                Objects.equals(breedOfHorse, horse.breedOfHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedOfHorse, speed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breedOfHorse='" + breedOfHorse + '\'' +
                ", speed=" + speed +
                '}';
    }
}
