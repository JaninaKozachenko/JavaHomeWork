package com.pb.kozachenko.hw7;

public class Tie extends  Clothes  implements ManClothes {
    public Tie() {
        super("галстук");
    }

    @Override
public void dressMan () {
        System.out.println("Тип одежды: " + getType() + ", размер: " + getSize().getDescription() + ", " + getSize().getEuroSize() + ", цвет: " + getColour() + ", цена (долл): " + getPrice());
    }
}
