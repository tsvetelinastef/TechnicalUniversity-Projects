package Upr_4;


public class test {

    public static void main(String arg[]) {

        Car car = new Car(200, "test", 2000, 123);
        Hovercraft hovercraft = new Hovercraft(50, "test", 3000, 10);
        Ship ship = new Ship(100, "test", 25000, 123);

        double carPromo = car.checkPromo();
        double hoverCraftPromo = hovercraft.checkPromo();
        double shipPromo = ship.checkPromo();

        System.out.println(carPromo + " " +  hoverCraftPromo + " " + shipPromo);

    }



}
