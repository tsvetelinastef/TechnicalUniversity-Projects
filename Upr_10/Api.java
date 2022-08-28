package Upr_10;


import java.util.List;

public class Api {
    public static void main(String[] args) {
        try {
            PresentStore.addTest();
            List<GetProductsTo> list = PresentStore.getAllProductsWithPrice(10);
            System.out.println(list.get(0));
        }catch (ProductUnavailable e){
            e.getMessage();
        }
    }
}
