package product;

import java.io.Serializable;

public class Fridge extends Furniture implements Serializable
{
    private int capacity;
    private String fridgeKind;
    private boolean hasFreezer;

    public Fridge(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription, String energyConsumptionDegree,
                  boolean garantee, int capacity, String fridgeKind, boolean hasFreezer) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, energyConsumptionDegree, garantee);
        this.capacity = capacity;
        this.fridgeKind = fridgeKind;
        this.hasFreezer = hasFreezer;
    }

    public void setCapacity(int capacity) {this.capacity = capacity;}
    public void setFridgeKind(String fridgeKind) {this.fridgeKind = fridgeKind;}
    public void setHasFreezer(boolean hasFreezer) {this.hasFreezer = hasFreezer;}

    public int getCapacity() {return capacity;}
    public String getFridgeKind() {return fridgeKind;}
    public boolean isHasFreezer() {return hasFreezer;}
}
