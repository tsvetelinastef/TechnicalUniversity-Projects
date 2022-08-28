package Upr_5;


public class FootballCompetition implements Competition{

    double fasterGoal;
    Participant[] schedule;

    @Override
    public Participant [] getSchedule(){

        return this.schedule;
    }
}
