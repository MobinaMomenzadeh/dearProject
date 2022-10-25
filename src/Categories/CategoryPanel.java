package Categories;

import Categories.Category;
import java.util.Scanner;
import java.util.ArrayList;


public class CategoryPanel
{
    private static Scanner cin=new Scanner(System.in);

    public static void categoryMenu()
    {
        System.out.println("select:\n1.view all categories\n2.filter category");
        switch (cin.nextInt())
        {
            case 1:
                for(Category i:Category.allCtegories)
                    System.out.println(i.toString());
                break;
            case 2:
                System.out.println("please enter specific detales");
                ArrayList<Category> withFilter=new ArrayList<Category>();
                withFilter= CategoryManager.detaleFilter(cin.next());
                for(Category i:withFilter)
                    System.out.println(i.toString());
                break;

        }
    }

}
