package Upr_5;

public class Participant {

    int id;
    String name;
    int age;
    double chanceToWin;
   // double betForWin = 0.0;
    double betForWin;

    public Participant(String name, int age, double chanceToWin, double betForWin, int id) {

        this.name = name;
        this.age = age;
        this.chanceToWin = chanceToWin;
        this.betForWin = betForWin;
        this.id = id;
    }
}
