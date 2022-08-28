package Upr_13;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Stand {
    private final LinkedList<Dish> dishes;

    public Stand() {
        dishes = new LinkedList<>();
    }

    static Semaphore semCon = new Semaphore(0);

    static Semaphore semProd = new Semaphore(1);

    void get(int index)
    {
        try {
            semCon.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        dishes.removeLast();
        System.out.println("Student " + index + " consumed a dish");

        semProd.release();
    }

    void put(Dish dish, int index)
    {
        try {
            semProd.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        dishes.add(dish);

        System.out.println("Employee " + index + " produced a dish");

        semCon.release();
    }
}
