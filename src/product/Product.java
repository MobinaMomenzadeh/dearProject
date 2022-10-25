package product;

import java.io.Serializable;
import java.util.ArrayList;

public class Product  implements Comparable<Product> , Serializable
{
    public static ArrayList<Product> allProducts =new ArrayList<Product>();
    private static int lastProductsId=0;
    private final int productId;
    private final String productName;
    private final String productCompany;
    private final double productPrice;
    private String sellerName;
    private int supplyStatus;
    private String productDescription;
    private double avarageOfPoints=0;
    private ArrayList<View> listOfViews = new ArrayList<View>();//to do

    public Product(String name, String productCompany, double price,String sellerName, int supplyStatus, String productDescription)
    {
        productName=name;
        this.productCompany=productCompany;
        productPrice=price;
        this.sellerName=sellerName;
        this.supplyStatus=supplyStatus;
        this.productDescription=productDescription;
        productId=lastProductsId++;
        allProducts.add(this);
        allProducts.sort(Product::compareTo);
    }



    public void setSellerName(String sellerName) {this.sellerName = sellerName;}
    public void setSupplyStatus(int supplyStatus) {this.supplyStatus = supplyStatus;}
    public void setProductDescription(String productDescription) {this.productDescription = productDescription;}

    //getter
    public int getProductsId() {return productId;}
    public String getProductName() {return productName;}
    public String getProductCompany() {return productCompany;}
    public double getProductPrice() {return productPrice;}
    public String getSellerName() {return sellerName;}
    public int getSupplyStatus() {return supplyStatus;}
    public String getProductDescription() {return productDescription;}
    public double getAvarageOfPoints() {return avarageOfPoints;}
    public ArrayList<View> getListOfViews() {return listOfViews;}

    public void addView(View view)
    {
        listOfViews.add(view);
    }


    private int pointcnt=1;
    public void addPoint (int num)
    {
        avarageOfPoints+=((avarageOfPoints*pointcnt)+num)/pointcnt;
        pointcnt++;
    }

    @Override
    public int compareTo(Product o) {
        if(this.productName.charAt(0)  > o.productName.charAt(0) )
            return 1;
        else if(this.productName.compareTo(o.productName) == 0)
        {
            if(this.avarageOfPoints > o.avarageOfPoints)
                return 1;
            else if(this.avarageOfPoints == o.avarageOfPoints)
            {
                if(this.productPrice > o.productPrice)
                    return 1;
                else if(this.productPrice == o.productPrice)
                {
                    if (this.supplyStatus > o.supplyStatus)
                        return 1;
                    else
                        return -1;
                }
                else
                    return -1;
            }
            else
                return -1;
        }
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", productPrice=" + productPrice +
                ", sellerName='" + sellerName + '\'' +
                ", supplyStatus=" + supplyStatus +
                ", productDescription='" + productDescription + '\'' +
                ", avarageOfPoints=" + avarageOfPoints +
                ", listOfViews=" + listOfViews +
                ", pointcnt=" + pointcnt +
                '}';
    }
}
