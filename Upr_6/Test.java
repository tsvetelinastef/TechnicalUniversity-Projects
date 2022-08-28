package Upr_6;

public class Test {

    public static void main(String[] args) {

        Books k1 = new Books(150 , 1, "Viktor Mart", "Life it self");
      //  Books k1 = new Books(150, 1, "Viktor Mart", "Life it self");
        Televisions t1 = new Televisions(750, 2, "LG", "4k", 1000);

        try {
            k1.checkPromo(k1.price);
            t1.checkPromo(t1.price);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            t1.Costs();
        } catch (PowerException e) {
            System.out.println(e.getMessage());

        }
    }

}

