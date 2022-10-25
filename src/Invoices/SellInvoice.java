package Invoices;

import product.Product;

import java.util.ArrayList;

public class SellInvoice
{
    private static int lastInvoiceNumber=0;
    private final int invoiceNumber;
    private String date;
    private double receivedPayment;
    private ArrayList<Product> solledProducts;
    private String coustomerName;
    private boolean sendStatus;

    public SellInvoice(String date, double receivedPayment, ArrayList<Product> solledProducts, String coustomerName, boolean sendStatus) {
        this.date = date;
        this.receivedPayment = receivedPayment;
        this.solledProducts = solledProducts;
        this.coustomerName = coustomerName;
        this.sendStatus = sendStatus;
        invoiceNumber=lastInvoiceNumber;
        lastInvoiceNumber++;
    }


    public void setDate(String date) {this.date = date;}
    public void setReceivedPayment(double receivedPayment) {this.receivedPayment = receivedPayment;}
    public void setSolledProducts(ArrayList<Product> solledProducts) {this.solledProducts = solledProducts;}
    public void setCoustomerName(String coustomerName) {this.coustomerName = coustomerName;}
    public void setSendStatus(boolean sendStatus) {this.sendStatus = sendStatus;}

    public int getInvoiceNumber() {return invoiceNumber;}
    public String getDate() {return date;}
    public double getReceivedPayment() {return receivedPayment;}
    public ArrayList<Product> getSolledProducts() {return solledProducts;}
    public String getCoustomerName() {return coustomerName;}
    public boolean isSendStatus() {return sendStatus;}
}
