package Upr_8;

import java.io.IOException;

public class BlackFriday extends ProductLoader {

    public static Electronics[] e1 = new Electronics[10];
    public static Book[] b1 = new Book[10];


    public BlackFriday(Electronics[] e12, Book[] b12) {

    }


    public static void processSales() {
        ProductLoader p1 = new BlackFriday(e1, b1);
        try {
            p1.importDataFromFile();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
