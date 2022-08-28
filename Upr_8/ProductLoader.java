package Upr_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class ProductLoader implements ImportData {
    Product[] el = new Product[getNumberOfRows()];
    Product[] bk = new Product[getNumberOfRows()];

    public Object[] importDataFromFile() throws IOException {
        int num = 0;
        Scanner scanner = new Scanner(new File("salesProducts.txt"));
        num = scanner.nextInt();


        if (num == 1) {
            int inventoryNumber;
            double price;
            int quantity;
            String provider;
            String manufacturer;
            String model;

            while (scanner.hasNext()) {
                inventoryNumber = scanner.nextInt();
                price = scanner.nextDouble();
                quantity = scanner.nextInt();
                provider = scanner.next();
                manufacturer = scanner.next();
                model = scanner.next();

                Electronics newel = new Electronics(inventoryNumber, price, quantity, provider, manufacturer, model);
                for (int i = 0; i < el.length; i++) {
                    el[i] = newel;
                }
            }
            return el;
        } else if (num == 2) {
            int inventoryNumber;
            double price;
            int quantity;
            String provider;
            String author;
            String title;

            while (scanner.hasNext()) {
                inventoryNumber = scanner.nextInt();
                price = scanner.nextDouble();
                quantity = scanner.nextInt();
                provider = scanner.next();
                author = scanner.next();
                title = scanner.next();

                Book newbk = new Book(inventoryNumber, price, quantity, provider, author, title);
                for (int i = 0; i < bk.length; i++) {
                    bk[i] = newbk;
                }
            }
            return bk;
        } else {
            throw new IOException();
        }

    }

    public int getNumberOfRows() {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("salesproducts.txt"))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;

    }

}








