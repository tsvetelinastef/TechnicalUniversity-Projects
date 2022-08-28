package Upr_5;

public class CreateEvent {


        String typeOfEvent;

        public Competition getEvent(String competitionType) {

            if (competitionType == null) {
                return null;
            }
            if (competitionType.equalsIgnoreCase("Football")) {
                this.typeOfEvent = competitionType;
                return new FootballCompetition();

            } else if (competitionType.equalsIgnoreCase("Horse")) {
                this.typeOfEvent = competitionType;
                return new HorseCompetition();

            } else if (competitionType.equalsIgnoreCase("Formula")) {
                this.typeOfEvent = competitionType;
                return new Formula1Competition();
            }

            return null;
        }

        public void fillSchedule(Competition ob, Participant[] schedule) {

            if (typeOfEvent.equals("Horse")) {
                HorseCompetition horse = (HorseCompetition) ob;
                horse.schedule = schedule;
            }
            if (typeOfEvent.equals("Football")) {
                FootballCompetition football = (FootballCompetition) ob;
                football.schedule = schedule;
            }
            if (typeOfEvent.equals("formula")) {
                Formula1Competition formula = (Formula1Competition) ob;
                formula.schedule = schedule;
            }

        }

    }

