package Categories;

import product.Product;

import java.util.ArrayList;

public class Category
{
    static ArrayList<Category> allCtegories;
    private String categoryName;
    private String specialFeatures;
    private ArrayList<Product> categoryProducs;

    public Category(String categoryName, String specialFeatures) {
        this.categoryName = categoryName;
        this.specialFeatures = specialFeatures;
    }

    public void setCategoryName(String categoryName) {this.categoryName = categoryName;}
    public void setSpecialFeatures(String specialFeatures) {this.specialFeatures = specialFeatures;}
    public void setCategoryProducs(ArrayList<Product> categoryProducs) {this.categoryProducs = categoryProducs;}

    public String getCategoryName() {return categoryName;}
    public String getSpecialFeatures() {return specialFeatures;}
    public ArrayList<Product> getCategoryProducs() {return categoryProducs;}

    void addProduct(Product product)
    {
        categoryProducs.add(product);
    }

    @Override
    public String toString() {
        return "Categories.Category{" +
                "categoryName='" + categoryName + '\'' +
                ", specialFeatures='" + specialFeatures + '\'' +
                ", categoryProducs=" + categoryProducs +
                '}';
    }
}
