package Persons;

public class Admin extends Account
{
    public static Admin admin;

    private Admin(String userName, String name, String sureName, String email, String phoneNumber, String password)
    {
        super(userName,name, sureName, email, phoneNumber, password, "Admin",1000000000);
    }

    public static Admin setAdmin()
    {
        if (admin==null)
            admin=new Admin("admin","AdminName","AdminSurename", "admin", "00000","admin" );
        return admin;
    }

    public static Admin getAdmin() {return admin;}

    public static void setAdmin(Admin admin) {Admin.admin = admin;}

}

