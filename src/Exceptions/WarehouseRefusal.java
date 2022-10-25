package Exceptions;

public class WarehouseRefusal extends InvalidShoping
{
    public WarehouseRefusal() {
        super("Product is not stock");
    }
}
