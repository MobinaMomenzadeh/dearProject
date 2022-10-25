package Persons;

import Exceptions.InvalidEmail;
import Exceptions.InvalidTelephoneNumber;
import Persons.AccountPanel;
import Persons.Seller;
import Persons.SellerManager;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class SellerPanel {

    private static Scanner cin=new Scanner(System.in);

    static void sellerLogin(String user,String password)
    {
        Seller dearSeller=new Seller();

        for(Seller i: SellerManager.tempSellers)
            if(i.getUserName().equals(user) && i.getPassword().equals(password))
            {
                System.out.println("Awaiting approval from admin");
                return;
            }

        int find=1;
        for(Seller a:Seller.allSeller)
            if(a.getUserName().equals(user) && a.getPassword().equals(password))
            {
                dearSeller = a;
                find = 0;
            }

        if(find==1)
        {
            System.out.println("Persons.Seller does not exist! please register first.");
            AccountPanel.accountArea();
        }

        if(find==0) {
            System.out.println(dearSeller.toString());
            System.out.println("select\n1.edit information\n2.edit product\n3.add product\n4.delet product");
            switch (cin.nextInt())
            {
                case 1:
                    System.out.println("what do you want to change:\n1.Name\n2.Surename\n3.Email\n4.Phonenumber\n5.password\n6.company name");
                    switch (cin.nextInt())
                    {
                        case 1:
                            System.out.println("enter new name");
                            dearSeller.setName(cin.next());
                            break;
                        case 2:
                            System.out.println("enter new surename");
                            dearSeller.setSureName(cin.next());
                            break;
                        case 3:
                            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
                            Pattern pattern = compile(regex);
                            System.out.println("enter new Email");
                            String tempEmail = cin.next();
                            Matcher matcher;
                            matcher = pattern.matcher(tempEmail);
                            try {
                                if (!matcher.matches())
                                    throw new InvalidEmail();
                                else
                                    dearSeller.setEmail(tempEmail);
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
                                    dearSeller.setPhoneNumber(temptel);
                            }
                            catch (InvalidTelephoneNumber ex)
                            {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case 5:
                            System.out.println("enter new password");
                            dearSeller.setPassword(cin.next());
                            break;
                        case 6:
                            System.out.println("enter new company name");
                            dearSeller.setCompanyName(cin.next());
                            break;

                    }
                case 2:
                    System.out.println("what do you want to edit?\n1.");
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("enter the id of product");
                    SellerManager.deleteProduct(dearSeller,cin.nextInt());
                    break;
            }
        }
    }

    static void sellerRegister()
    {
        System.out.println("for registration please enter Username, Password, Name, Surename, Email, PhoneNumber, Companyname");
        String tempuser=cin.next();
        String pass=cin.next();
        SellerManager.sellerRegister(tempuser, cin.next(), cin.next() ,cin.next() ,cin.next(),pass, cin.next() );
        System.out.println("Welcome! now you should wait for admin acceptation");
    }
}
