package Upr_11;

import java.util.Scanner;

public abstract class Question {
    public static int num = 0;
    String question;
    String response;
    int correctAnswer;
    public Question(String question){

        this.question = question;
    }
    public Question(){
    }
    public void askQuestion(){
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        this.response = scanner.nextLine();
    }
    public boolean checkQuestion(int correctAnswer){
        if(response != null && Integer.parseInt(response) == correctAnswer){
            num++;
            return  true;
        }
        return false;
    }

}

/*

import java.util.Scanner;

public abstract class Question {
    private String questionFromTest;

    public Question(String questionFromTest) {

        this.questionFromTest = questionFromTest;
    }

    public  void askQuestion() {
        System.out.println(this.questionFromTest);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
    }

    public abstract boolean  checkQuestion(Object userAnswer);
}

 */