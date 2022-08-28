package Upr_11;

import java.util.Arrays;
import java.util.List;

public class Test {
    List<Question> question = Arrays.asList(new IntegerQuestion("2 + 2 = ?"), new IntegerQuestion("3 + 3 = ?"));
    public static void performTest(){
        IntegerQuestion question1 = new IntegerQuestion(4);
        IntegerQuestion question2 = new IntegerQuestion(5);

    }

    public static int numCorrect(){

        return Question.num;
    }

    public static void main(String[] args) {
        performTest();
        shuffle();
        System.out.println("the number of correct answers is + " + numCorrect());
    }

    private static double shuffle() {
        return Math.random();
    }


}

/*

import java.util.ArrayList;
import java.util.List;

public class Test {
    private List questions;
    Question question;

    public Test(List questions) {
        this.questions = questions;
    }

    public void performTest(){
        for (Object q: questions ) {
            ((Question) q).askQuestion();
        }
    }

    public int numCorrectAnswers(){
        int count = 0;
        for (Object q: questions) {
            if (((Question)q).checkQuestion(q)){
                count++;
            }
        }
        return count;
    }

     public void shuffle(){
        double random = Math.random();
        questions.get((int)random);
    }


    public static void main(String[] args) {
        List questions = new ArrayList(10);
        questions.add(new OpenQuestion("What is the color of sky?", "Blue"));
        questions.add(new OpenQuestion("What is the color of bear?", "Brown"));
        questions.add(new OpenQuestion("What is the color of sun?", "Yellow"));
        questions.add(new IntegerQuestion("2+2",4));
        questions.add(new IntegerQuestion("100*2",200));
        questions.add(new IntegerQuestion("0*0",0));
        questions.add(new OpenQuestion("What is capital of Bulgaria?", "Sofia"));
        questions.add(new OpenQuestion("What is the color of cat?", "White"));
        questions.add(new IntegerQuestion("9*0",0));
        questions.add(new OpenQuestion("What is the color of banana?", "Yellow"));

        Test test = new Test(questions);
        test.shuffle();
        test.performTest();
        test.numCorrectAnswers();


    }
}

 */