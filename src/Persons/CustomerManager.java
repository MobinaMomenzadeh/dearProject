package Persons;

import Files.Writes;
import Persons.Customer;
import SQLthings.MainPart;
import product.Product;
import Invoices.*;
import Exceptions.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class CustomerManager
{
    static String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    static String telregex = "^\\d{11}$";
    static Pattern pattern = compile(regex);
    static Pattern telpattern = compile(telregex);


    static boolean customerRegiser(String userName, String name, String sureName, String email, String phoneNumber, String password, double customerCredit) throws Exception {
        for(Customer i: Customer.allCustomers )
            if(i.getUserName().equals(userName))
                return false;

        //System.out.println(email);
        //System.out.println(phoneNumber);
        //try {
            Matcher matcher;
            matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                throw new InvalidEmail();
            }
        /*}
        catch (InvalidEmail ex)
        {
            System.out.println(ex.getMessage());
        }

         */



        //try {
            Matcher telmatcher;
            telmatcher = telpattern.matcher(phoneNumber);
            if (!telmatcher.matches()) {
                throw new InvalidTelephoneNumber();
            }
        /*}
        catch (InvalidTelephoneNumber ex)
        {
            System.out.println(ex.getMessage());
        }

         */




        Customer.allCustomers.add(new Customer(userName,name, sureName, email, phoneNumber, password, customerCredit));
        //File f1 = new File("G:\\savedData\\users\\customers\\"+userName);
        //f1.mkdir();

       /*try
        {
            Writes.writeFiles();
        }
        catch (IOException ex )
         {System.out.println(ex.getMessage());}*/


        return true;
    }

    static double totalPrice(Customer x)
    {
        double sum=0;
        for(Product i:x.getShopingBasket())
            sum+=i.getProductPrice();
        return sum;

    }

    static boolean checkBought(Customer x,int id)
    {
        boolean check=false;
        for(BuyInvoice i:x.getBuyRecords())
            for(Product j:i.getBoughtProducs())
                if(j.getProductsId()==id)
                    check=true;
        return check;
    }





}
