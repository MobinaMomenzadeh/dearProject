package Invoices;

import product.Product;

import java.util.ArrayList;

public class BuyInvoice
{
    private static int lastInvoiceNumber=0;
    private final int invoiceNumber;
    private String date;
    private double paidCredit;
    private ArrayList<Product> boughtProducs=new ArrayList<Product>();
    private String sellerName;
    private boolean deliverStatus;

    public BuyInvoice(String date, double paidCredit, ArrayList<Product> boughtProducs, /*String sellerName*/ boolean deliverStatus) {
        this.date = date;
        this.paidCredit = paidCredit;
        for(Product i:boughtProducs)
        {
            this.boughtProducs.add(i);
        }
       /* this.sellerName = sellerName;*/
        this.deliverStatus = deliverStatus;
        this.invoiceNumber=lastInvoiceNumber;
        lastInvoiceNumber++;
    }

    public void setDate(String date) {this.date = date;}
    public void setPaidCredit(double paidCredit) {this.paidCredit = paidCredit;}
    public void setBoughtProducs(ArrayList<Product> boughtProducs) {this.boughtProducs = boughtProducs;}
    public void setSellerName(String sellerName) {this.sellerName = sellerName;}
    public void setDeliverStatus(boolean deliverStatus) {this.deliverStatus = deliverStatus;}

    public int getInvoiceNumber() {return invoiceNumber;}
    public String getDate() {return date;}
    public double getPaidCredit() {return paidCredit;}
    public ArrayList<Product> getBoughtProducs() {return boughtProducs;}
    public String getSellerName() {return sellerName;}
    public boolean isDeliverStatus() {return deliverStatus;}

    @Override
    public String toString() {
        return "Invoices.BuyInvoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", date='" + date + '\'' +
                ", paidCredit=" + paidCredit +
                ",\n boughtProducs=" + boughtProducs.toString() +
                ",\n deliverStatus=" + deliverStatus +
                '}';
    }
}
