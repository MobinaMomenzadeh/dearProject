package product;

import java.io.Serializable;

public class Stove extends Furniture implements Serializable
{
    private int flameNumber;
    private String stoveMaterial;
    private boolean hasOven;

    public Stove(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription,
                 String energyConsumptionDegree, boolean garantee, int flameNumber, String stoveMaterial, boolean hasOven) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, energyConsumptionDegree, garantee);
        this.flameNumber = flameNumber;
        this.stoveMaterial = stoveMaterial;
        this.hasOven = hasOven;
    }

    public void setFlameNumber(int flameNumber) {this.flameNumber = flameNumber;}
    public void setStoveMaterial(String stoveMaterial) {this.stoveMaterial = stoveMaterial;}
    public void setHasOven(boolean hasOven) {this.hasOven = hasOven;}

    public int getFlameNumber() {return flameNumber;}
    public String getStoveMaterial() {return stoveMaterial;}
    public boolean isHasOven() {return hasOven;}

    @Override
    public String toString() {
        return super.toString()+" Stove{" +
                "flameNumber=" + flameNumber +
                ", stoveMaterial='" + stoveMaterial + '\'' +
                ", hasOven=" + hasOven +
                '}';
    }
}
