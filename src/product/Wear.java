package product;

import product.Product;

import java.io.Serializable;

public class Wear extends Product implements Serializable
{
    private String producerCountry;
    private String material;

    public Wear(String name, String productCompany, double price, String sellerName, int supplyStatus,
                String productDescription, String producerCountry, String material) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription);
        this.producerCountry = producerCountry;
        this.material = material;
    }

    public void setProducerCountry(String producerCountry) {this.producerCountry = producerCountry;}
    public void setMaterial(String material) {this.material = material;}

    public String getProducerCountry() {return producerCountry;}
    public String getMaterial() {return material;}

    @Override
    public String toString() {
        return super.toString()+"Wear{" +
                "producerCountry='" + producerCountry + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
