package Invoices;

import Exceptions.WarehouseRefusal;
import Invoices.BuyInvoice;
import Persons.Customer;
import product.Product;

public class BuyInvoiceManager {

    public static BuyInvoice invoice(Customer a, double paid )
    {
        for(Product i : a.getShopingBasket())
        {
            try {
                if (i.getSupplyStatus() <= 0)
                    throw new WarehouseRefusal();
            }
            catch (WarehouseRefusal ex)
            {
                System.out.println(ex.getMessage());
            }

        }
        BuyInvoice x=new BuyInvoice("1382/1/21",paid,a.getShopingBasket(),true);
        return x;
    }

}
