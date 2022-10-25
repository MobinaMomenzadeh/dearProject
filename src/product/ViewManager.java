package product;

import Persons.Customer;

public class ViewManager {
    public static void takeview(Customer user, Product product, String text , boolean productIsBought)
    {
        product.addView(new View(user,product,text,productIsBought));
    }
}
