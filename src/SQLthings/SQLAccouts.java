package SQLthings;

import Persons.Account;

public class SQLAccouts
{
    public static void saveAccount(Account a)
    {
        try {
            MainPart.runExecute(String.format("INSERT INTO `accounts`(`Username`, `Name`, `Family`, `Email`, `Phonenumber`, `Role`, `password`, `credit`) VALUES ('%s','%s','%s','%s','%s','%s','%s','%f')", a.getUserName(), a.getName(), a.getSureName(), a.getEmail(), a.getPhoneNumber(), a.getRole(), a.getPassword(), a.getCredit()));
        }
        catch (Exception ex){System.out.println(ex.getMessage());}
    }

    public static void saveEmail(Account a)
    {
        try {
            MainPart.runExecute(String.format("INSERT INTO `emails`(`Username`, `Email`) VALUES ('%s','%s')", a.getUserName(),a.getEmail()));
        }
        catch (Exception ex){System.out.println(ex.getMessage());}
    }

    public static void save_phoneNumber(Account a)
    {
        try {
            MainPart.runExecute(String.format("INSERT INTO `phonenumber`(`Username`, `phone number`) VALUES ('%s','%s')", a.getUserName(),a.getPhoneNumber()));
        }
        catch (Exception ex){System.out.println(ex.getMessage());}
    }

    static int error_cnt = 0;
    public static void errorLogs(String ex)
    {
        try {
            MainPart.runExecute(String.format("INSERT INTO `error logs`(`num`, `massage`) VALUES ('%d','%s')",error_cnt,ex));
            error_cnt++;
        }
        catch (Exception e){System.out.println(e.getMessage());}
    }

    /*public static void selectAccounts()
    {

    }*/



}
