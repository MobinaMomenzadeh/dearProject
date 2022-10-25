package Persons;


import SQLthings.SQLAccouts;

import java.io.File;
import java.util.ArrayList;
public class Account {
     public static ArrayList<Account> allAccounts=new ArrayList<Account>();
    //personal fields
    private String userName;
    private String name;
    private String sureName;
    private String email;
    private String phoneNumber;
    private String password;

    private String role;

    private double credit;

    // list of Invoice: will be at each costumer or seller

    ////
    Account(String nan){};

    Account(String userName, String name, String sureName, String email, String phoneNumber, String password, String role, double credit) {
        this.userName = userName;
        this.name = name;
        this.sureName = sureName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.credit = credit;
        allAccounts.add(this);

        //sql-------------------------------------------------
        SQLAccouts.saveAccount(this);
        SQLAccouts.save_phoneNumber(this);
        SQLAccouts.saveEmail(this);
    }

    void setUserName (String userName) {this.userName=userName;}
    void setName (String name) {this.name=name;}
    void setSureName (String sureName) {this.sureName=sureName;}
    void setEmail (String email) {this.email=email;}
    void setPhoneNumber (String phoneNumber) {this.phoneNumber=phoneNumber;}
    void setPassword (String password) {this.password=password;}

    public String getUserName() {return userName; }
    public String getName() {return name;}
    public String getSureName() {return sureName;}
    public String getEmail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getPassword() {return password;}
    public String getRole() {return role;}
    public double getCredit() {return credit;}

    @Override
    public String toString() {
        return "Persons.Account{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", credit=" + credit +
                '}';
    }
}
