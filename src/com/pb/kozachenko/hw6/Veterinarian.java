package com.pb.kozachenko.hw6;

public class Veterinarian {
    public void treatAnimal (Animal... animals) {
        System.out.println("Посещения:");
        for (Animal a : animals) {
            System.out.println("\n" + a.getType() + "\nеда: "+a.getFood()+ "\nсреда обитания: " + a.getLocation());
            }
        }
    }
