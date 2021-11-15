package com.pb.kozachenko.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes tshirt = new Tshirt();
        tshirt.setSize(Size.S);
        tshirt.setColour("голубой");
        tshirt.setPrice(40);

        Clothes tie = new Tie();
        tie.setSize(Size.S);
        tie.setColour("зеленый");
        tie.setPrice(30);

        Clothes pants = new Pants();
        pants.setSize(Size.XXS);
        pants.setColour("белый");
        pants.setPrice(60);

        Clothes skirt = new Skirt();
        skirt.setSize(Size.S);
        skirt.setColour("малиновый");
        skirt.setPrice(90);

        Clothes [] clothes = {tshirt, tie, pants, skirt};

        dressMan(clothes);
        System.out.println();
        dressWomen(clothes);
    }
    static void dressMan (Clothes [] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }
    static  void dressWomen (Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }
}
