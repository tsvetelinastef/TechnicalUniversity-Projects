package Upr_10;


import java.util.ArrayList;
import java.util.List;

public abstract class Product implements GetProductsTo, DeliveryAPI {
    private String type;
    private double price;
    private int idOfProvider;
    private String number;
    private static List<Product> list = new ArrayList<>();
    public Product(String type, double price, int idOfProvider, String number) {
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdOfProvider() {
        return idOfProvider;
    }

    public void setIdOfProvider(int idOfProvider) {
        this.idOfProvider = idOfProvider;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static List<Product> getList() {
        return list;
    }

    public static void setList(List<Product> list) {
        Product.list = list;
    }

    @Override
    public int getNumber1(int idOfProvider) {
        return 0;
    }

    @Override
    public String getType1(int idOfProvider) {
        return null;
    }

    @Override
    public int getIdOfProvider1() {
        return 0;
    }

    @Override
    public double getPrice1() {
        return 0;
    }

    @Override
    public String getType1() {
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", idOfProvider=" + idOfProvider +
                ", number='" + number + '\'' +
                '}';
    }
}
