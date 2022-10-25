package product;

import product.DigitalProduct;

import java.util.ArrayList;
public class DigitalProductManager {

    static ArrayList<DigitalProduct> storage(int s)
    {
        ArrayList<DigitalProduct> filters=new ArrayList<DigitalProduct>();
        for(DigitalProduct i:DigitalProduct.allDigitalProducts)
            if(i.getStorageCapacity()==s)
                filters.add(i);

        return filters;
    }

    static ArrayList<DigitalProduct> ram(int s)
    {
        ArrayList<DigitalProduct> filters=new ArrayList<DigitalProduct>();
        for(DigitalProduct i:DigitalProduct.allDigitalProducts)
            if(i.getRam()==s)
                filters.add(i);

        return filters;
    }

    static ArrayList<DigitalProduct> operating(String s)
    {
        ArrayList<DigitalProduct> filters=new ArrayList<DigitalProduct>();
        for(DigitalProduct i:DigitalProduct.allDigitalProducts)
            if(i.getOperatingSystem().equals(s))
                filters.add(i);

        return filters;
    }

    static ArrayList<DigitalProduct> weight(double s)
    {
        ArrayList<DigitalProduct> filters=new ArrayList<DigitalProduct>();
        for(DigitalProduct i:DigitalProduct.allDigitalProducts)
            if(i.getWeight()==s)
                filters.add(i);

        return filters;
    }

    static ArrayList<DigitalProduct> dimension(String s)
    {
        ArrayList<DigitalProduct> filters=new ArrayList<DigitalProduct>();
        for(DigitalProduct i:DigitalProduct.allDigitalProducts)
            if(i.getDimension()==s)
                filters.add(i);

        return filters;
    }
}
