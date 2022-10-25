package product;

import product.Product;
import Persons.*;


public class View
{
    enum viewStatus {ACCEPTED, AWAITING_APPROVAL, NOT_ACCEPTED_BY_ADMIN}
    private String text;
    private Account user;
    private Product product;
    private viewStatus viewStatus;
    private boolean productIsBought;

    public View(Account user, Product product, String text , boolean productIsBought) {
        this.user = user;
        this.product = product;
        this.text=text;
        this.productIsBought = productIsBought;
    }

    public void setUser(Account user) {this.user = user;}
    public void setProduct(Product product) {this.product = product;}
    public void setViewStatus(viewStatus viewStatus) {this.viewStatus = viewStatus;}
    public void setProductIsBought(boolean productIsBought) {this.productIsBought = productIsBought;}

    public Account getUser() {return user;}
    public Product getProduct() {return product;}
    public viewStatus getViewStatus() {return viewStatus;}
    public boolean isProductIsBought() {return productIsBought;}


    @Override
    public String toString() {
        return "product.View{" +
                "text='" + text + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", viewStatus=" + viewStatus +
                ", productIsBought=" + productIsBought +
                '}';
    }
}
