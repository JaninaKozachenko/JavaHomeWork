package com.pb.kozachenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt() {
        super("футболка");
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
