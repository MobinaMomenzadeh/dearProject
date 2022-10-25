package Persons;

import Exceptions.*;
import Persons.AccountPanel;
import Persons.Customer;
import Persons.CustomerManager;
import SQLthings.SQLAccouts;
import product.Product;
import product.ProductPanel;
import product.ViewManager;
import Invoices.*;
import java.util.Scanner;




import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class CustomerPanel {
    private static Scanner cin = new Scanner(System.in);

    static void customermenu(String username, String password) {
        Customer dearCustomer = new Customer(" ");
        boolean find = true;
        String info = "nan";
        for (Customer a : Persons.Customer.allCustomers)
            if (a.getUserName().equals(username) && a.getPassword().equals(password)) {
                dearCustomer = a;
                info = dearCustomer.toString();
                find = false;
            }


        if (find) {
            System.out.println("user does not exist! please register first.");
            AccountPanel.accountArea();
        }


        System.out.println("your information: " + info);
        System.out.println("select\n1.edit information\n2.product.View products\n3.shopping basket\n4.view buy records\n5.give point\n6.add view");


        switch (cin.nextInt()) {
            case 1:
                System.out.println("what do you want to change:\n1.Name\n2.Surename\n3.Email\n4.Phonenumber\n5.password");
                switch (cin.nextInt()) {
                    case 1:
                        System.out.println("enter new name");
                        dearCustomer.setName(cin.next());
                        break;

                    case 2:
                        System.out.println("enter new Surename");
                        dearCustomer.setSureName(cin.next());
                        break;

                    case 3:
                        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
                        Pattern pattern = compile(regex);
                        System.out.println("enter new Email");
                        String tempEmail = cin.next();
                        Matcher matcher;
                        matcher = pattern.matcher(tempEmail);
                        try
                        {
                            if (!matcher.matches())
                                throw new InvalidEmail();
                            else
                                dearCustomer.setEmail(tempEmail);
                        }
                        catch (InvalidEmail ex)
                        {
                           System.out.println(ex.getMessage());
                        }
                        break;

                    case 4:
                        String telregex = "^\\d{11}$";
                        Pattern telpattern = compile(telregex);
                        System.out.println("enter new phonenumber");
                        String temptel = cin.next();
                        Matcher telmatcher;
                        telmatcher = telpattern.matcher(temptel);
                        try {
                            if (!telmatcher.matches())
                                throw new InvalidTelephoneNumber();
                            else
                                dearCustomer.setPhoneNumber(temptel);
                        }
                        catch (InvalidTelephoneNumber ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                        break;

                    case 5:
                        System.out.println("enter new password");
                        dearCustomer.setPassword(cin.next());
                        break;
                }
                break;

            case 2:
                ProductPanel.productmenu();
                break;
            case 3:
                System.out.println("*shopping basket*\n1.view shopping bassket\n2.add product\n3.pay");
                switch (cin.nextInt()) {
                    case 1:
                        if (dearCustomer.getShopingBasket().size() == 0)
                            System.out.println("empty basket");
                        else
                            for (Product i : dearCustomer.getShopingBasket())
                                System.out.println(i.toString());
                        customermenu(dearCustomer.getUserName(), dearCustomer.getPassword());
                        break;

                    case 2:
                        System.out.println("please enter id of product that you want to add");
                        dearCustomer.addToBasket(cin.nextInt());
                        break;

                    case 3:
                        try {
                            if (CustomerManager.totalPrice(dearCustomer) > dearCustomer.getCustomerCredit()) {
                                System.out.println("credit is not enough");
                                throw new LackOfCredit();
                            }
                        } catch (LackOfCredit ex) {
                            System.out.println(ex.getMessage());
                            System.out.println("clear basket?\n1.yes\n2.2.no");
                            switch (cin.nextInt()) {
                                case 1:
                                    dearCustomer.clearBasket();
                                    break;
                                case 2:
                                    break;
                            }
                        }
                        if (CustomerManager.totalPrice(dearCustomer) <= dearCustomer.getCustomerCredit()) {
                            System.out.println("Total:" + CustomerManager.totalPrice(dearCustomer) + "\nwill you pay?\n1.yes\n2.no");
                            switch (cin.nextInt()) {
                                case 1:
                                    dearCustomer.setCustomerCredit(dearCustomer.getCustomerCredit() - CustomerManager.totalPrice(dearCustomer));
                                    dearCustomer.addInvoice(BuyInvoiceManager.invoice(dearCustomer, CustomerManager.totalPrice(dearCustomer)));
                                    dearCustomer.clearBasket();
                                    break;
                                case 2:
                                    dearCustomer.clearBasket();
                                    break;
                            }
                        }
                        break;

                    case 4:
                        for (BuyInvoice i : dearCustomer.getBuyRecords())
                            System.out.println(i.toString());
                        break;
                    case 5:
                        System.out.println("enter code of product");
                        int id = cin.nextInt();
                        if (CustomerManager.checkBought(dearCustomer, id)) {
                            System.out.println("enter the point");
                            Product.allProducts.get(id).addPoint(cin.nextInt());
                        } else
                            System.out.println("you have not bought this product");
                        break;
                    case 6:
                        System.out.println("enter code of product and your view");
                        id = cin.nextInt();
                        ViewManager.takeview(dearCustomer, Product.allProducts.get(id), cin.next(), CustomerManager.checkBought(dearCustomer, id));
                        break;


                }


        }
    }


        static void customerRegister() {
            System.out.println("for registration please enter Username, password ,name, Surename, Email, PhoneNumber, Credit");
            String tempuser = cin.next();
            String pass = cin.next();
        boolean find = true;

       //do{
            try {
                //find=
                        CustomerManager.customerRegiser(tempuser, cin.next(), cin.next(), cin.next(), cin.next(),pass,cin.nextDouble());
           }
            catch (InvalidTelephoneNumber e) {
               SQLAccouts.errorLogs(e.getMessage());
                System.out.println(e.getMessage());
               AccountPanel.accountArea();
            }
            catch (InvalidEmail e)
            {
              SQLAccouts.errorLogs(e.getMessage());
              System.out.println(e.getMessage());
                AccountPanel.accountArea();
            }
            catch (Exception e)
            {
                SQLAccouts.errorLogs(e.getMessage());
                System.out.println(e.getMessage());
                AccountPanel.accountArea();
            }


           // if(find==false)
              //  System.out.println("this username already exist please try again");
       //}while(find==true);

            System.out.println("Welcome! select a number :\n1.go to your account\n2.go to homepage");
            switch (cin.nextInt()) {
                case 1:
                    customermenu(tempuser, pass);
                case 2:
                    AccountPanel.accountArea();
            }


        }
    }

