package Persons;

import product.Product;
import Invoices.BuyInvoice;

import java.util.ArrayList;

public class Customer extends Account
{
    public static ArrayList<Customer> allCustomers=new ArrayList<Customer>();
    private ArrayList<Product> shopingBasket=new ArrayList<Product>();
    private ArrayList<BuyInvoice> buyRecords=new ArrayList<BuyInvoice>();
    private double customerCredit;


    public Customer(String userName, String name, String sureName, String email, String phoneNumber, String password, double customerCredit)
    {
        super(userName,name, sureName, email, phoneNumber, password, "Persons.Customer",customerCredit);
        this.customerCredit=customerCredit;
        allCustomers.add(this);
    }

    public Customer(String nan){super("");}

    @Override
    public String toString() {
        return super.toString()+"\n"+"Persons.Customer{" +
                "shopingBasket=" + shopingBasket +
                ", buyRecords=" + buyRecords +
                ", customerCredit=" + customerCredit +
                '}';
    }




    public void setShopingBasket(ArrayList<Product> shopingBasket) {this.shopingBasket = shopingBasket;}
    public void setBuyRecords(ArrayList<BuyInvoice> buyRecords) {this.buyRecords = buyRecords;}
    public void setCustomerCredit(double customerCredit) {this.customerCredit = customerCredit;}

    public ArrayList<Product> getShopingBasket() {return shopingBasket;}
    public ArrayList<BuyInvoice> getBuyRecords() {return buyRecords;}
    public double getCustomerCredit() {return customerCredit;}

    void addInvoice (BuyInvoice invoice)
    {
        buyRecords.add(invoice);
    }

    void addToBasket(int id )
    {
        for(Product i:Product.allProducts)
            if(id==i.getProductsId())
                shopingBasket.add(i);
    }

    void clearBasket()
    {
        shopingBasket.clear();
    }
}
