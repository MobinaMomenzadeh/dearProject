package product;

import java.io.Serializable;
import java.util.ArrayList;
public class Mobile extends DigitalProduct implements Serializable
{
    static ArrayList<Mobile> allMobiles=new ArrayList<Mobile>();
    private int SimNumber;
    private int cameraQuality;

    public Mobile(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription
            , int storageCapacity, int ram, String operatingSystem, double weight, String dimension, int simNumber, int cameraQuality) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, storageCapacity, ram, operatingSystem, weight, dimension);
        SimNumber = simNumber;
        this.cameraQuality = cameraQuality;
        allMobiles.add(this);
    }

    public void setSimNumber(int simNumber) {SimNumber = simNumber;}
    public void setCameraQuality(int cameraQuality) {this.cameraQuality = cameraQuality;}

    public int getSimNumber() {return SimNumber;}
    public int getCameraQuality() {return cameraQuality;}

    @Override
    public String toString() {
        return super.toString()+"\n"+"product.Mobile{" +
                "SimNumber=" + SimNumber +
                ", cameraQuality=" + cameraQuality +
                '}';
    }
}
