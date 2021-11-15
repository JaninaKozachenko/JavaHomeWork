package com.pb.kozachenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants() {
        super("штаны");
    }

    @Override
    public void dressMan () {
        System.out.println("Тип одежды: " + getType() + ", размер: " + getSize().getDescription() + ", " + getSize().getEuroSize() + ", цвет: " + getColour() + ", цена (долл): " + getPrice());
    }

    @Override
    public void dressWomen () {
        System.out.println("Тип одежды: " + getType() + ", размер: " + getSize().getDescription() + ", " + getSize().getEuroSize() + ", цвет: " + getColour() + ", цена (долл): " + getPrice());
    }
}
