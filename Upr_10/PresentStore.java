package Upr_10;

import Upr_8.NoMoreProductsException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PresentStore implements DeliveryAPI, GetProductsTo {
    public static ArrayList<GetProductsTo> products = new ArrayList<>();
    public static ArrayList<DeliveryAPI> devApi = new ArrayList<>();

    public static void addTest(){
        Product1 product1 = new Product1("juice", 1.5, 11114, "123");
        Product2 product2 = new Product2("food", 15, 11115, "124");
        products.add(product1);
        products.add(product2);
    }

    public static List<GetProductsTo> getAllProductsWithPrice(double price) throws ProductUnavailable {
        List<GetProductsTo> list = new ArrayList<>();
        for(GetProductsTo productsTo:  products){
            if(productsTo instanceof Product){
                if(((Product) productsTo).getPrice() < price){
                    list.add(productsTo);
                }
            }
        }
        if(list.isEmpty()){
            throw new ProductUnavailable("There is no such product!");
        }
        return list;
    }

    public static List<GetProductsTo> getAllProductsWithId(int id) throws ProductUnavailable {
        List<GetProductsTo> list = new ArrayList<>();
        for(GetProductsTo productsTo:  products){
            if(productsTo instanceof Product){
                if(((Product) productsTo).getIdOfProvider() == id){
                    list.add(productsTo);
                }
            }
        }
        if(list.isEmpty()){
            throw new ProductUnavailable("There is no such product!");
        }
        return list;
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
}
