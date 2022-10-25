package Persons;

import product.Product;
import Invoices.*;


import java.util.ArrayList;


public class Seller extends Account {
        public static ArrayList<Seller> allSeller = new ArrayList<Seller>();
        private String companyName;
        private ArrayList<SellInvoice> sellRecords = new ArrayList<SellInvoice>();
        private ArrayList<Product> products;

        Seller() {
                super("");
        }

        Seller(String userName, String name, String sureName, String email, String phoneNumber, String password, String companyName) {
                super(userName, name, sureName, email, phoneNumber, password, "Seller",0);
                this.companyName = companyName;

        }


        public String getCompanyName() {return companyName;}
        public ArrayList<SellInvoice> getSellRecords() {return sellRecords;}
        public ArrayList<Product> getProducts() {return products;}

        public void setCompanyName(String companyName) {this.companyName = companyName;}
        public void setSellRecords(ArrayList<SellInvoice> sellRecords) {this.sellRecords = sellRecords;}
        public void setProducts(ArrayList<Product> products) {this.products = products;}
}