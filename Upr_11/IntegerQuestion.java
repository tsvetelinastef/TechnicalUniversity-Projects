package Upr_11;

public class IntegerQuestion extends Question {

    public IntegerQuestion(String question){
        super(question);
    }

    public IntegerQuestion(int correctAnswer){
        super.correctAnswer = correctAnswer;
        String check;
        if(checkQuestion(correctAnswer)){
            check = "correct";
        }else{
            check = "wrong";
        }
        response = check;
        OpenQuestion q = new OpenQuestion();
        q.getResponse();
    }

}

/*

public class IntegerQuestion extends Question{
    private Integer rightAnswer;

    public IntegerQuestion(String questionFromTest, Integer rightAnswer) {
        super(questionFromTest);
        this.rightAnswer = rightAnswer;
    }

    @Override
    public boolean checkQuestion(Object userAnswer) {
        if (userAnswer instanceof Integer){
            Integer usAnswer = (Integer) userAnswer;
            if (this.rightAnswer.equals(usAnswer)){
                return true;
            }
        }
        return false;
    }
}

 */