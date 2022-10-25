import Pages.Home5;
import Persons.AccountPanel;
import product.*;

import javax.swing.*;

import java.util.InputMismatchException;

public class Main
{

    public static void main(String[] args) {



        Mobile p = new Mobile("A10", "Sony", 100.10, "percy", 0, "very good", 128, 8, "Android", 100, "0.5*5*10", 2, 64);
        Food p1 = new Food("Banana", "sdf", 10, "banana seller", 20, "yellow banana", "10/3/1401", "1/3/1401");
        Shoes p2 = new Shoes("Red heighheels", "meli", 50, "lskd", 500, "lkdkfl", "Iran", "leather", 38, Shoes.SHOES.HIGH_HEELS);
        Laptop p3 = new Laptop("ASUS vivobook", "ASUS", 800, "laptop forosh", 12, "nice laptop", 1, 16, "windos", 1500, "83948", "intel core i7", false);


        /*SwingUtilities.invokeLater(new Runnable() {
                                       @Override
                                       public void run() {
                                           Home5 x = new Home5();
                                           x.setVisible(true);
                                       }
                                   });*/


        ///-----------------------
        while (true) {

            try {
                AccountPanel.accountArea();
                //Writes.writeFiles();
            }
            catch (InputMismatchException ex) {
                SQLthings.SQLAccouts.errorLogs(ex.getMessage());
                AccountPanel.accountArea();
            }
                   /*catch (Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }*/


                   /* catch (FileNotFoundException ex)
                    {
                        print(ex.getMessage());
                    }
                    catch (IOException e) {
                        print(e.getMessage());
                    }
                    finally
                    {
                        try
                            {
                                Writes.writeFiles();
                            }
                            catch(IOException ex) {}
                        print("good luck");
                    }
                    print("------------------------------");

                    */
        }

    }
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
}


