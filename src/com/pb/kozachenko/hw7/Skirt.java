package com.pb.kozachenko.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt() {
        super("юбка");
    }

    @Override
    public void dressWomen () {
        System.out.println("Тип одежды: " + getType() + ", размер: " + getSize().getDescription() + ", " + getSize().getEuroSize() + ", цвет: " + getColour() + ", цена (долл): " + getPrice());
    }
}
