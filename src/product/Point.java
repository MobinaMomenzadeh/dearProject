package product;

import product.Product;
import Persons.*;


public class Point
{
    private Account user;
    private int point;
    private Product product;

    public Point(Account user, int point, Product product) {
        this.user = user;
        this.point = point;
        this.product = product;
    }

    public void setUser(Account user) {this.user = user;}
    public void setPoint(int point) {this.point = point;}
    public void setProduct(Product product) {this.product = product;}

    public Account getUser() {return user;}
    public int getPoint() {return point;}
    public Product getProduct() {return product;}
}
