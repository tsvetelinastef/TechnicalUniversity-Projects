package Upr_13;

public class Student implements Runnable{
    private  final Stand stand;
    private final int index;

    Student(Stand stand, int count, int index) {
        this.stand = stand;
        this.index = index;
        for (int i = 0; i < count; i++){
            new Thread(this, "Student").start();
        }
    }

    public void run()
    {
        while (true){
            try {
                Thread.sleep(1000);
                stand.get(index);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
