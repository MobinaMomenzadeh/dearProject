package Categories;

import Categories.Category;

import java.util.ArrayList;
public class CategoryManager {

    static ArrayList<Category> detaleFilter(String s)
    {
        ArrayList<Category> filters=new ArrayList<Category>();
        for(Category i:Category.allCtegories)
            if(i.getSpecialFeatures().equals(s))
                filters.add(i);

        return filters;
    }
}
