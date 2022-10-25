package product;

import java.io.Serializable;

public class Shoes extends Wear implements Serializable
{
    private int shoeSize;
    private SHOES shoeKind;
    public enum SHOES {SNEAKERS, HIGH_HEELS, SANDALS, BOOTS}

    public Shoes(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription
            , String producerCountry, String material, int shoeSize, SHOES shoeKind) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, producerCountry, material);
        this.shoeSize = shoeSize;
        this.shoeKind = shoeKind;
    }

    public void setShoeSize(int shoeSize) {this.shoeSize = shoeSize;}
    public void setShoeKind(SHOES shoeKind) {this.shoeKind = shoeKind;}

    public int getShoeSize() {return shoeSize;}
    public SHOES getShoeKind() {return shoeKind;}


    @Override
    public String toString() {
        return super.toString()+ " Shoes{" +
                "shoeSize=" + shoeSize +
                ", shoeKind=" + shoeKind +
                '}';
    }
}
