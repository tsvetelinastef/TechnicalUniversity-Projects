package Upr_5;


public class Formula1Competition implements Competition {

    double WinnersTime;
    Participant[] schedule;

    @Override
    public Participant[] getSchedule() {

        return this.schedule;
    }

}
