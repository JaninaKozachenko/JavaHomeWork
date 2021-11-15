package com.pb.kozachenko.hw7;

public abstract class Clothes {
    private  String type;
    private Size size;
    private int price;
    private String colour;

    public Clothes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
