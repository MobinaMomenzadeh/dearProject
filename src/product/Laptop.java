package product;

import java.io.Serializable;
import java.util.ArrayList;
public class Laptop extends DigitalProduct implements Serializable
{
    static ArrayList<Laptop> allLaptops=new ArrayList<Laptop>();
    private String processorModel;
    private boolean isGaming;

    public Laptop(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription
            , int storageCapacity, int ram, String operatingSystem, double weight, String dimension, String processorModel, boolean isGaming) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, storageCapacity, ram, operatingSystem, weight, dimension);
        this.processorModel = processorModel;
        this.isGaming = isGaming;
        allLaptops.add(this);
    }

    public void setProcessorModel(String processorModel) {this.processorModel = processorModel;}
    public void setGaming(boolean gaming) {isGaming = gaming;}

    public String getProcessorModel() {return processorModel;}
    public boolean isGaming() {return isGaming;}

    @Override
    public String toString() {
        return super.toString()+"product.Laptop{" +
                "processorModel='" + processorModel + '\'' +
                ", isGaming=" + isGaming +
                '}';
    }
}
