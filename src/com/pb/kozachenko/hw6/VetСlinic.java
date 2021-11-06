package com.pb.kozachenko.hw6;


public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException,  IllegalAccessException,  InstantiationException {
        Dog dogOne = new Dog();
        dogOne.setName("Шарик");
        dogOne.setFood("кости");
        dogOne.setLocation("будка");
        dogOne.setBreedOfDog("лабрадор");

        Cat catOne = new Cat();
        catOne.setFood("корм");
        catOne.setLocation("диван");
        catOne.setCountMouse(25);
        catOne.setBreedOfCat("мейн-кун");

        Horse horseOne = new Horse();
        horseOne.setFood("трава");
        horseOne.setLocation("природа");
        horseOne.setBreedOfHorse("Пржевальского");
        horseOne.setSpeed(60);


        Animal[] animals = new Animal[]{dogOne, catOne, horseOne};
        Class wetClazz = Class.forName("com.pb.kozachenko.hw6.Veterinarian");

        Object obj;
        obj = wetClazz.newInstance();
        if (obj instanceof Veterinarian) {
            ((Veterinarian) obj).treatAnimal(animals);
        }

    }
}

