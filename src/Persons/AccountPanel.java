package Persons;

import Exceptions.InvalidEmail;
import Exceptions.InvalidTelephoneNumber;


import Pages.Home5;
import product.ProductPanel;
import Categories.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountPanel
{
    //private static Scanner cin=new Scanner(System.in);
    private static ArrayList<Account> accounts=new ArrayList<Account>();

    public static  void accountArea()
    {
        //System.out.println("Welcome! select a number: \n1.view products\n2.login and register");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Home5 x = new Home5();
                x.setVisible(true);
            }
        });



        try{
            Scanner cin=new Scanner(System.in);
         int num = cin.nextInt();

        switch (num)
        {
            case 1:
               System.out.println("select:\n1.view categories\n2.view all product");
               switch (cin.nextInt())
               {
                   case 1:
                       CategoryPanel.categoryMenu();
                       break;
                   case 2:
                       ProductPanel.productmenu();
                       break;
               }
               break;

            case 2:
            System.out.println("select a number:\n1.register\n2.login");
            switch (cin.nextInt()) {
                case 1:
                    System.out.println("select your role:\n1.Seller\n2.Customer");
                    switch (cin.nextInt()) {
                        case 1:
                            SellerPanel.sellerRegister();
                            break;
                        case 2:
                            try {
                                    CustomerPanel.customerRegister();
                            }
                            catch (InvalidEmail ex)
                            {
                             System.out.println(ex.getMessage());
                            }
                            catch (InvalidTelephoneNumber ex)
                            {
                                System.out.println(ex.getMessage());
                            }
                            break;
                    }
                    break;

                case 2:
                    System.out.println("select: you are a\n1.Persons.Customer\n2.Persons.Seller\n3.Persons.Admin");
                    switch (cin.nextInt()) {
                        case 1:
                            System.out.println("please enter your username and password");
                            CustomerPanel.customermenu(cin.next(), cin.next());
                            break;
                        case 2:
                            System.out.println("please enter your username and password");
                            SellerPanel.sellerLogin(cin.next(), cin.next());
                            break;
                        case 3:
                            System.out.println("please enter your username and password");
                            AdminPanel.adminMenu(cin.next(), cin.next());
                            break;
                    }
                    break;
            }

        }
        }
        catch (InputMismatchException ex)
        {
            accountArea();
        }
    }
}
