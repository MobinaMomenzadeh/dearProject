package Persons;

import Persons.Seller;
import product.Product;

import java.io.File;
import java.util.ArrayList;
public class SellerManager {
    static ArrayList<Seller> tempSellers=new ArrayList<Seller>();

    static void sellerRegister(String userName, String name, String sureName, String email,String phoneNumber, String password,String companyName)
    {
        tempSellers.add(new Seller(userName, name, sureName, email, phoneNumber, password,companyName));
    }

    static void deleteProduct(Seller x,int id)
    {
        for(Product i:x.getProducts())
            if(i.getProductsId()==id)
               x.getProducts().remove(i);
    }

}