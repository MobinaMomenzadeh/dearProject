package product;

import java.io.Serializable;
import java.util.ArrayList;
public class DigitalProduct extends Product implements Serializable
{
    static ArrayList<DigitalProduct> allDigitalProducts= new ArrayList<DigitalProduct>();
    private int storageCapacity;
    private int ram;
    private String operatingSystem;
    private double weight;
    private String dimension;

    DigitalProduct(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription, int storageCapacity, int ram, String operatingSystem, double weight, String dimension) {
       super(name, productCompany, price, sellerName, supplyStatus, productDescription);
        this.storageCapacity = storageCapacity;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.dimension = dimension;
        allDigitalProducts.add(this);

    }

    public void setStorageCapacity(int storageCapacity) {this.storageCapacity = storageCapacity;}
    public void setRam(int ram) {this.ram = ram;}
    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setDimension(String dimension) {this.dimension = dimension;}

    public int getStorageCapacity() {return storageCapacity;}
    public int getRam() {return ram;}
    public String getOperatingSystem() {return operatingSystem;}
    public double getWeight() {return weight;}
    public String getDimension() {return dimension;}

    @Override
    public String toString() {
        return super.toString()+"\n"+"product.DigitalProduct{" +
                "storageCapacity=" + storageCapacity +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", weight=" + weight +
                ", dimension='" + dimension + '\'' +
                '}';
    }
}
