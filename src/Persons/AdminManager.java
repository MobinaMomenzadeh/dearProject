package Persons;

import Persons.Account;

import java.io.File;
import java.util.ArrayList;

public class AdminManager {
    ArrayList<Seller> sellerRequest=new ArrayList<Seller>();

    static String takeSeller (Seller seller, int x)
    {
        if(x == 1)
        {
            Seller.allSeller.add(seller);
            //File f1 = new File("G:\\savedData\\users\\customers\\"+seller.getUserName());
           // f1.mkdir();
            return (" username:"+seller.getUserName()+" Name:"+seller.getName()+" "+seller.getSureName()+" accepted as a seller");
        }
        else
            return (" username:"+seller.getUserName()+" Name:"+seller.getName()+" "+seller.getSureName()+" did not accepted by Persons.Admin");
    }

    static void deletUser(String userna)
    {
        for(Account i:Account.allAccounts)
            if(i.getUserName().equals(userna))
                Account.allAccounts.remove(i);
    }



}
