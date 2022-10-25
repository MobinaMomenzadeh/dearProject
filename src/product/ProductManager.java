package product;

import product.Product;

import java.util.ArrayList;

public class ProductManager {

    static ArrayList<Product> companyFilter(String name)
    {
        ArrayList<Product> withFilter= new ArrayList<>();
        for(Product i:Product.allProducts)
            if(i.getProductCompany().equals(name))
                withFilter.add(i);

        return  withFilter;
    }

    static ArrayList<Product>  priceFilter(double maxprice)
    {
        ArrayList<Product> withFilter= new ArrayList<>();
        for(Product i:Product.allProducts)
            if(i.getProductPrice() <= maxprice)
                withFilter.add(i);

        return  withFilter;
    }

    static ArrayList<Product> nameFilter(String name)
    {
        ArrayList<Product> withFilter= new ArrayList<>();
        for(Product i:Product.allProducts)
            if(i.getProductName().equals(name))
                withFilter.add(i);

        return  withFilter;
    }

    static ArrayList<Product> supplyFilter(int number)
    {
        ArrayList<Product> withFilter= new ArrayList<>();
        for(Product i:Product.allProducts)
            if(i.getSupplyStatus() >= number)
                withFilter.add(i);

        return  withFilter;
    }



}
