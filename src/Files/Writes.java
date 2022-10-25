package Files;

import Invoices.BuyInvoice;
import Invoices.SellInvoice;
import Persons.Account;
import Persons.Customer;
import Persons.Seller;
import product.*;

import java.io.*;
import java.util.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Formatter;

import static Persons.Admin.admin;

public class Writes
{

    public static void makeFolders()
    {
        File f1 = new File("G:\\savedData");
        f1.mkdir();
        File f11 = new File("G:\\savedData\\users");
        File f12 = new File("G:\\savedData\\categories");
        f11.mkdir();
        f12.mkdir();

        f1 = new File("G:\\savedData\\users\\admin");
        f1.mkdir();
        f1 = new File("G:\\savedData\\users\\customers");
        f1.mkdir();
        f1 = new File("G:\\savedData\\users\\sellers");
        f1.mkdir();

        f1 = new File("G:\\savedData\\categories\\clothes");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\clothes\\shoes");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\clothes\\shoes\\list of products");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\clothes\\wear");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\clothes\\wear\\list of products");
        f1.mkdir();

        f1 = new File("G:\\savedData\\categories\\Food");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Food\\list of products");
        f1.mkdir();

        f1 = new File("G:\\savedData\\categories\\Digital Product");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Digital Product\\laptop");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Digital Product\\laptop\\list of products");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Digital Product\\phone");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Digital Product\\phone\\list of products");
        f1.mkdir();

        f1 = new File("G:\\savedData\\categories\\Furniture");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Furniture\\stove");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Furniture\\stove\\list of products");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Furniture\\fridge");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Furniture\\fridge\\list of products");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Furniture\\tv");
        f1.mkdir();
        f1 = new File("G:\\savedData\\categories\\Furniture\\tv\\list of products");
        f1.mkdir();
    }



    public static void writeFiles() throws IOException {

        //admin
        /*Formatter adm = new Formatter("G:\\savedData\\users\\admin\\info");
        adm.format("%s",admin.toString());
        adm.close();*/


         for(Customer a : Customer.allCustomers)
         {
             try {
                 Path path = Paths.get("G:\\savedData\\users\\customers\\" + a.getUserName());
                 File f = new File(String.valueOf(path));
                 f.mkdir();

                 Formatter ft = new Formatter(String.valueOf(path)+"\\shoping basket");
                 ft.format("%s",a.getShopingBasket().toString());
                 ft.close();

                 FileOutputStream in = new FileOutputStream("G:\\savedData\\users\\customers\\" + a.getUserName()+"\\buy invoices");
                 ObjectOutputStream invoice = new ObjectOutputStream(in);
                 for(BuyInvoice i : a.getBuyRecords())
                     invoice.writeObject(i);
                 invoice.close();

                 ft = new Formatter("G:\\savedData\\users\\customers\\" + a.getUserName()+"\\info");
                 ft.format("%s",a.toString());
                 ft.close();



             }
             catch (IOException ex)
             {
                 System.out.println("file error  "+ex.getMessage());
             }


         }

        for(Seller a : Seller.allSeller)
        {
            try {
                Path path = Paths.get("G:\\savedData\\users\\sellers\\" + a.getUserName());
                File f = new File(String.valueOf(path));
                f.mkdir();

                f = new File("G:\\savedData\\users\\sellers\\" + a.getUserName()+"\\list of products");
                f.mkdir();


                Formatter ft = new Formatter(String.valueOf(path)+"\\info");
                ft.format("%s",a.toString());
                ft.close();


                FileOutputStream in = new FileOutputStream("G:\\savedData\\users\\sellers\\" + a.getUserName()+"\\sell invoices");
                ObjectOutputStream invoice = new ObjectOutputStream(in);
                for(SellInvoice i : a.getSellRecords())
                    invoice.writeObject(i);
                invoice.close();
            }
            catch (IOException ex)
            {
                System.out.println("file error "+ex.getMessage());
            }
        }


        for(Product j : Product.allProducts)
        {
            if(j instanceof Shoes)
            {

                File f = new File("G:\\savedData\\categories\\clothes\\shoes\\list of products\\shoes"+j.getProductsId());
                f.mkdir();

                Formatter ft = new Formatter("G:\\savedData\\categories\\clothes\\shoes\\list of products\\shoes"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();


                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\clothes\\shoes\\list of products\\shoes"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();

            }
            else if(j instanceof Clothes)
            {
                File f = new File("G:\\savedData\\categories\\clothes\\wear\\list of products\\clothes"+j.getProductsId());
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\clothes\\wear\\list of products\\clothes"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\clothes\\wear\\list of products\\clothes"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();

            }
            else if(j instanceof Food)
            {
                File f = new File("G:\\savedData\\categories\\Food\\list of products\\food"+j.getProductsId());
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\Food\\list of products\\food"+j.getProductsId()+"\\info");
                ft.format("%s", j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\Food\\list of products\\food"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();



            }
            else if(j instanceof Laptop)
            {
                File f = new File("G:\\savedData\\categories\\Digital Product\\laptop\\list of products\\laptop"+j.getProductsId());
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\Digital Product\\laptop\\list of products\\laptop"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\Digital Product\\laptop\\list of products\\laptop"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();
            }
            else if(j instanceof Mobile)
            {
                File f = new File("G:\\savedData\\categories\\Digital Product\\phone\\list of products\\phone"+j.getProductsId());
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\Digital Product\\phone\\list of products\\phone"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\Digital Product\\phone\\list of products\\phone"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();
            }
            else if(j instanceof Tv)
            {
                File f = new File("G:\\savedData\\categories\\Furniture\\tv\\list of products\\tv"+j.getProductsId());
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\Furniture\\tv\\list of products\\tv"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\Furniture\\tv\\list of products\\tv"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();



            }
            else if(j instanceof  Fridge)
            {
                File f = new File("G:\\savedData\\categories\\Furniture\\fridge\\list of products\\fridge"+j.getProductsId());
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\Furniture\\fridge\\list of products\\fridge"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\Furniture\\fridge\\list of products\\fridge"+j.getProductsId()+"\\view");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();


            }
            else if(j instanceof  Stove)
            {
                 File f = new File("G:\\savedData\\categories\\Furniture\\stove\\list of products\\stove"+j.getProductsId()+"\\");
                f.mkdir();
                Formatter ft = new Formatter("G:\\savedData\\categories\\Furniture\\stove\\list of products\\stove"+j.getProductsId()+"\\info");
                ft.format("%s",j.toString());
                ft.close();

                FileOutputStream in = new FileOutputStream("G:\\savedData\\categories\\Furniture\\stove\\list of products\\stove"+j.getProductsId()+"\\views");
                ObjectOutputStream view = new ObjectOutputStream(in);
                for(View i : j.getListOfViews())
                    view.writeObject(i);
                view.close();
                in.close();
            }
        }

    }
}
