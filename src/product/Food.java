package product;

import product.Product;

import java.io.Serializable;

public class Food extends Product implements Serializable
{
    private String expirationDate;
    private String productionDate;

    public Food(String name, String productCompany, double price, String sellerName,
                int supplyStatus, String productDescription, String expirationDate, String productionDate) {
        super(name, productCompany, price, sellerName, supplyStatus, productDescription);
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
    }

    public void setExpirationDate(String expirationDate) {this.expirationDate = expirationDate;}
    public void setProductionDate(String productionDate) {this.productionDate = productionDate;}

    public String getExpirationDate() {return expirationDate;}
    public String getProductionDate() {return productionDate;}
}
