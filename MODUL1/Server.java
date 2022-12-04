package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        String menu;
        String category;
        int price;
        String name;
        int phone_number;


        // TODO Create Database
        Database objekdatabase = new Database()
        // TODO Create Menu
        Menu objekmenu = new Menu()
        // TODO Insert Menu to Database
        objekmenu.setMenu("Steak Wagyu")
        objekmenu.setCategory("Daging-dagingan")
        objekmenu.setPrice(3000000)

        objekdatabase.insertMenu(menu)
        objekdatabase.insertMenu(category)
        objekdatabase.insertMenu(price)
        // TODO Display Main Menu and User must be Register First
        User objekuser = new User()
        
        objekuser.setName("Naufal Eka Prasetya");
        objekuser.setPhone(087870667614)

        // TODO Create User from register in Main Menu
        objek.registerUser()

        // TODO Display Menu
        objekuser.displayUser("Naufal Eka Prasetya", 087870667614)
    }
}
