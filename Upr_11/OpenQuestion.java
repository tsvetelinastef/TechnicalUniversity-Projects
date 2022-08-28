package Upr_11;

public class OpenQuestion extends Question {

    public void getResponse(){

        System.out.println(super.question+ " is " +super.response);
    }

}

/*

public class OpenQuestion extends Question{
    private String answer;

    public OpenQuestion(String questionFromTest, String answer) {
        super(questionFromTest);
        this.answer = answer;
    }

    @Override
    public boolean checkQuestion(Object userAnswer) {
        if (userAnswer instanceof  String){
            String usAnswer = (String) userAnswer;
            if (this.answer.equals(usAnswer)){
                return true;
            }
        }
        return false;
    }
}

 */