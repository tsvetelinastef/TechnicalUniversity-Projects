package Upr_5;


public class HorseCompetition implements Competition {

    String breed;
    Participant[] schedule;

    @Override
    public Participant [] getSchedule(){

        return this.schedule;
    }
}
