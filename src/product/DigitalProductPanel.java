package product;

import product.DigitalProduct;
import product.DigitalProductManager;


import java.util.Scanner;
import java.util.ArrayList;
public class DigitalProductPanel {

    private static Scanner cin=new Scanner(System.in);
    static void digitalFilter()
    {
        System.out.println("select:\n1.base of public features\n2.base of specefic options");
        ArrayList<DigitalProduct> filter=new ArrayList<DigitalProduct>();
        switch (cin.nextInt())
        {
            case 1:
                System.out.println("filter base of:\n1.Storage capacity\n2.ram\n3.Operating system\n4.weight\n5.dimension");
                ArrayList<DigitalProduct> filters;
                       switch (cin.nextInt())
                       {
                           case 1:
                               System.out.println("please enter storage capacity");
                               filter= DigitalProductManager.storage(cin.nextInt());
                               for(DigitalProduct i:filter)
                                   System.out.println(i.toString());
                               break;
                           case 2:
                               System.out.println("please enter ram capacity");
                               filter=DigitalProductManager.ram(cin.nextInt());
                               for(DigitalProduct i:filter)
                                   System.out.println(i.toString());
                               break;
                           case 3:
                               System.out.println("please enter operating system");
                               filter=DigitalProductManager.operating(cin.next());
                               for(DigitalProduct i:filter)
                                   System.out.println(i.toString());
                               break;
                           case 4:
                               System.out.println("please enter weight");
                               filter=DigitalProductManager.weight(cin.nextDouble());
                               for(DigitalProduct i:filter)
                                   System.out.println(i.toString());
                               break;
                           case 5:
                               System.out.println("please enter dimention");
                               filter=DigitalProductManager.dimension(cin.next());
                               for(DigitalProduct i:filter)
                                   System.out.println(i.toString());
                               break;
                       }
            case 2:
                System.out.println("select:\n1.product.Laptop options\n2.mobile options");
                switch (cin.nextInt())
                {
                    case 1:

                }
                break;
        }
    }
}
