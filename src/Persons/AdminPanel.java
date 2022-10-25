package Persons;

import Exceptions.InvalidEmail;
import Exceptions.InvalidTelephoneNumber;
import Persons.Account;
import Persons.Admin;
import Persons.AdminManager;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Persons.Admin.admin;
import static java.util.regex.Pattern.compile;

public class AdminPanel {
    private static Scanner cin= new Scanner(System.in);

    static void adminMenu(String username,String password)
    {
        if(username.equals("admin") && password.equals("admin"))
        {
            Admin.setAdmin();
            System.out.println(Admin.getAdmin().toString());
            System.out.println("1.edit information\n2.view requests\n3.view all users\n4.delete user\n5.category lists");
            switch (cin.nextInt())
            {
                case 1:
                   System.out.println("what do you want to change:\n1.Name\n2.Surename\n3.Email\n4.Phonenumber\n5.password");
                    switch (cin.nextInt())
                    {
                        case 1:
                            System.out.println("enter new name");
                            Admin.getAdmin().setName(cin.next());
                            break;
                        case 2:
                            System.out.println("enter new surename");
                            Admin.getAdmin().setSureName(cin.next());
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
                                    admin.setEmail(tempEmail);
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
                                    admin.setPhoneNumber(temptel);
                            }
                            catch (InvalidTelephoneNumber ex)
                            {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case 5:
                            System.out.println("enter new password");
                            Admin.getAdmin().setPassword(cin.next());
                            break;
                    }
                    break;

                    case 2:
                        System.out.println("select:\n1.seller request\n2.add product requests\n3.edit product request");
                        switch (cin.nextInt())
                        {
                            case 1:
                                for(Seller i: SellerManager.tempSellers)
                                {
                                    System.out.println("do you accept " + i.getName() + " " + i.getSureName() + " as a seller?\n1.Yes\n2.No");
                                    System.out.println(AdminManager.takeSeller(i,cin.nextInt()));
                                }
                                    SellerManager.tempSellers.clear();
                                break;
                            case 2:
                                //todo add product request
                            case 3:
                                //todo edit product request
                        }
                    break;
                case 3:
                    for(Account i:Account.allAccounts)
                        System.out.println(i.toString());
                    break;
                case 4:
                    System.out.println("please enter the username of user");
                    AdminManager.deletUser(cin.next());
                    System.out.println("user deleted");
                    break;
                case 5:
                    //todo category lists
                    break;
            }
        }
        else
            System.out.println("admin doesn't exist");
    }


}
