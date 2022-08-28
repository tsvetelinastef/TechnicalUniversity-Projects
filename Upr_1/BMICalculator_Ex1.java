package Upr_1;

import java.util.Scanner;

public class BMICalculator_Ex1 {

    // public static void main(String[] args) {

    /*
    public static void main(String[] args) {

       // method =  printIntroduction()
    }
     */


    // 2. Създайте и имплементирайте метод printIntroduction() – той ще се извиква всеки път при стартиране на програмата.
    // Той ще трябва да информира потребителя какво прави програмата, която е пуснал.

    public void printIntroduction() {
        System.out.println("This is BMICalculator. You have to enter your personal height and weight. ");
    }



    public void getBMI() {
        Scanner Scanner = new Scanner(System.in);

        double weight = Double.parseDouble(Scanner.nextLine());
        double height = Double.parseDouble(Scanner.nextLine());

        System.out.println("Enter your height in inches: ");
        double finalWeight = 0.3937 * height;
        // System.out.printf("Enter your %d in inches: ", finalWeight);
        System.out.println("Enter your weight: ");
        double finalHeight = 2.2046 * weight;

    }

    //4. Създайте метод bmiFor(), който по подадени тегло и височина, изчислява body mass index и го връща като резултат.
    // Формулата за индекса е: weight*703/ (height*height).

    public void bmiFor() {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());


        double bodyMaxIndex = weight * 703 / (height * height);

        System.out.println(bodyMaxIndex);

    }

    // 5. Направете така, че методът getBMI() да връща като резултат, резултатът, който връща методът bmiFor().

    //public void getBMI() {

    // return(bodyMaxIndex);

    //}


    //6. Направете метод getStatus(). Той трябва да връща като резултат един от символните низове: underweight, normal, overweight, obese.
    // По статистики на център за здраве, тези 4 характеристики се дават съответно ако:
    // индексът е не повече от 18,5, ако индексът е не повече от 25, ако индексът е не повече от 30 и ако е над 30.

    public void getStatus() {
        // int[]test = {underweight, normal, overweight, obese};

        System.out.println();
    }



    //7. Създайте метод ReportResults, който приема като параметри: пореден номер на резултата, BMI индекс, статус.
    // Той трябва да изведе на конзолата подходящо съобщение, с което уведомява, че човекът с номер Х има BMI= х.х, закръглен до втория знак.
    // За закръглянето изпозлвайте Math.round(BMI);

    public void ReportResults() {

    }


    //8. В main метод на програмата създайте Scanner, който чете от стандартен вход, подайте го към getBM(),
    // после по върнатия от него резултат вземете статуса с метод getStatus() и извикайте метода reportResults(), за да изведете даннитe.

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
    }


}



