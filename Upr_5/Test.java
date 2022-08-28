package Upr_5;

public class Test {
    public static void main(String[] args) {

        Participant[] schedule = new Participant[1];
        schedule[0] = new Participant("Ivan", 26, 1.94, 200, 1);
        CreateEvent event = new CreateEvent();
        Competition ob = event.getEvent("Football");
        event.fillSchedule(ob, schedule);
        Participant[] sch = ob.getSchedule();
        System.out.println(event.typeOfEvent);
        System.out.println(sch[0].name + "     " + sch[0].age + "  " + sch[0].chanceToWin);
        bets(ob, 1, 100);
        System.out.println(sch[0].name + "     " + sch[0].age + "  " + sch[0].chanceToWin);
        bets(ob, 1, 100);
        System.out.println(sch[0].name + "     " + sch[0].age + "  " + sch[0].chanceToWin);
        System.out.println(sch[0].betForWin);

    }

    static void bets(Competition ob, int id, double bet) {
        Participant[] participant = ob.getSchedule();
        for (Participant part : participant) {
            if (part.id == id) {
                double resultBet = (part.betForWin + bet) / part.betForWin;
                part.betForWin = part.betForWin + bet;
                double chanceToWin = part.chanceToWin / resultBet;
                if (chanceToWin < 1.1) {
                    part.chanceToWin = 1.1;
                } else {
                    part.chanceToWin = chanceToWin;
                }
            }

        }
    }

}
