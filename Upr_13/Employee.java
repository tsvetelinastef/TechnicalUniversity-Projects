package Upr_13;

public class Employee implements Runnable{
    private final Stand stand;
    private final int index;

    Employee(Stand stand, int index) {
        this.stand = stand;
        this.index = index;
        new Thread(this, "Employee").start();
    }

    public void run()
    {
        while (true){
            try {
                Thread.sleep(1000);
                stand.put(new Dish(), index);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
