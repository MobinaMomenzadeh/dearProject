package product;


import product.Product;
import product.ProductManager;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductPanel
{
   private static Scanner cin=new Scanner(System.in);
   public static void productmenu()
   {
      System.out.println("view product base on:\n1.all products\n2.filter on public featurs\n3.filter base of spesefic featurs");
      switch (cin.nextInt())
      {
         case 1:
            for(Product a: Product.allProducts)
               System.out.println(a.toString());
            break;

         case 2:
            System.out.println("filter base on:\n1.productCompany\n2.price\n3.productName\n4.supplyStatus");
            ArrayList<Product> fillters=new ArrayList<Product>();
            switch (cin.nextInt())
            {
               case 1:
                  System.out.println("Please enter Companyname");
                  fillters= ProductManager.companyFilter(cin.next());
                  if(fillters.size()==0)
                     System.out.println("Not found!");
                  else
                     for (Product i:fillters)
                        System.out.println(i.toString());
                  break;

               case 2:
                  System.out.println("Please enter the maximom price");
                  fillters=ProductManager.priceFilter(cin.nextDouble());
                  if(fillters.size()==0)
                     System.out.println("Not found!");
                  else
                     for (Product i:fillters)
                        System.out.println(i.toString());
                  break;

               case 3:
                  System.out.println("Please enter the product name");
                  fillters=ProductManager.nameFilter(cin.next());
                  if(fillters.size()==0)
                     System.out.println("Not found!");
                  else
                     for (Product i:fillters)
                        System.out.println(i.toString());
                  break;

               case 4:
                  System.out.println("Please enter number of product you want");
                  fillters=ProductManager.supplyFilter(cin.nextInt());
                  if(fillters.size()==0)
                     System.out.println("Not found!");
                  else
                     for (Product i:fillters)
                        System.out.println(i.toString());
                  break;

            }
            break;

         case 3:
            System.out.println("Search in:\n1.digital products ");
            switch (cin.nextInt())
            {
               case 1:
                  DigitalProductPanel.digitalFilter();
            }

      }
   }


   void addProduct()
   {

   }
}
