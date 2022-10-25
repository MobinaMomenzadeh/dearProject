package product;

import java.io.Serializable;

public class Tv extends Furniture implements Serializable
{
    private int pictureQuality;
    private String screenSize;

    public Tv(String name, String productCompany, double price, String sellerName, int supplyStatus, String productDescription, String energyConsumptionDegree
            , boolean garantee, int pictureQuality, String screenSize) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription, energyConsumptionDegree, garantee);
        this.pictureQuality = pictureQuality;
        this.screenSize = screenSize;
    }

    public void setPictureQuality(int pictureQuality) {this.pictureQuality = pictureQuality;}
    public void setScreenSize(String screenSize) {this.screenSize = screenSize;}

    public int getPictureQuality() {return pictureQuality;}
    public String getScreenSize() {return screenSize;}

    @Override
    public String toString() {
        return super.toString()+" Tv{" +
                "pictureQuality=" + pictureQuality +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
