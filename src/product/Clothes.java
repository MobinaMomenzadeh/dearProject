package product;

import product.Wear;

import java.io.Serializable;

public class Clothes extends Wear implements Serializable
{
    enum ClothesKind {TSHIRT, PANT, TOP, SKIRT}
    private int size;
    private ClothesKind clothesKind;

    public Clothes(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription,
                   String producerCountry, String material, int size, ClothesKind clothesKind) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, producerCountry, material);
        this.size = size;
        this.clothesKind = clothesKind;
    }

    public void setSize(int size) {this.size = size;}
    public void setClothesKind(ClothesKind clothesKind) {this.clothesKind = clothesKind;}

    public int getSize() {return size;}
    public ClothesKind getClothesKind() {return clothesKind;}

    @Override
    public String toString() {
        return super.toString()+"Clothes{" +
                "size=" + size +
                ", clothesKind=" + clothesKind +
                '}';
    }
}
