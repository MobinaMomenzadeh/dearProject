package product;

import product.Product;

import java.io.Serializable;

public class Furniture extends Product implements Serializable
{
    private String energyConsumptionDegree;
    private boolean garantee;

    public Furniture(String name, String productCompany, double price, String sellerName, int supplyStatus,
                     String productDescription, String energyConsumptionDegree, boolean garantee) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription);
        this.energyConsumptionDegree = energyConsumptionDegree;
        this.garantee = garantee;
    }

    public void setEnergyConsumptionDegree(String energyConsumptionDegree) {this.energyConsumptionDegree = energyConsumptionDegree;}
    public void setGarantee(boolean garantee) {this.garantee = garantee;}

    public String getEnergyConsumptionDegree() {return energyConsumptionDegree;}
    public boolean isGarantee() {return garantee;}
}
