package Upr_2;

import java.util.Scanner;


public class Ex2_tryingToGo {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
        // 1. Създайте клас BMICalculator.


        printIntroduction();

        getBMI();

        bmiFor();

        //  double bodyMaxIndex = 0.0;
        // 5

        getStatus();

        ReportResults();

        //2. Създайте и имплементирайте метод printIntroduction() – той ще се извиква всеки път при стартиране на програмата.
        // Той ще трябва да информира потребителя какво прави програмата, която е пуснал.

    }

    public static void printIntroduction() {
        System.out.println("This is BMICalculator. You have to enter your personal height and weight. ");
    }

    // 3. Създайте метод getBMI(), който ще „поиска“ и ще „събере“ информация от потребителя за неговото тегло и височина.
    // Нека да приема като аргумент Scanner, който чете от клавиатурата.
    // В имплементацията на метода ще трябва да подканите потребителя да въведе височината си
    // в инчове(За да си пресметнете височината използвайте, че 1см.= 0.3937 inch) и теглото си в паунди(използвайте формулата
    //kg = lb / 2,2046). Нека за сега методът ви връща void.

    public static void getBMI() {
        Scanner Scanner = new Scanner(System.in);
       // double result = 0;
       // String status = null;

        System.out.println("Enter your height: ");
        double height = Double.parseDouble(Scanner.nextLine());
        double finalWeight = 0.3937 * height;
        System.out.printf("Your height in inches is: %f ", finalWeight);
        System.out.println();

        System.out.println();
        System.out.println("Enter your weight: ");
        double weight = Double.parseDouble(Scanner.nextLine());
        double finalHeight = 2.2046 * weight;
        System.out.printf("Your weight in pounds is: %f", finalHeight);
        System.out.println();

     //   result = bmiFor(finalHeight , finalWeight);
     //   System.out.println("Your BMI is: " + Math.round(result));
     //   status = getStatus(result);
     //   System.out.println("Your Status is: " + status);


    }

    //4. Създайте метод bmiFor(), който по подадени тегло и височина,
    // изчислява body mass index и го връща като резултат. Формулата за индекса е: weight*703/ (height*height).


    public static void bmiFor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        double finalWeight = Double.parseDouble(scanner.nextLine());
        double finalHeight = Double.parseDouble(scanner.nextLine());


        //  double bodyMaxIndex = weight * 703 / (height * height);
        double bodyMaxIndex = finalWeight * 703 / (finalHeight * finalHeight);

        System.out.println(bodyMaxIndex);

    }

    // 5. Направете така, че методът getBMI() да връща като резултат, резултатът, който връща методът bmiFor().


    // 6. Направете метод getStatus().
    // Той трябва да връща като резултат един от символните низове: underweight, normal, overweight, obese.
    // По статистики на център за здраве, тези 4 характеристики се дават съответно ако:
    // индексът е не повече от 18,5, ако индексът е не повече от 25, ако индексът е не повече от 30 и ако е над 30

    public static void getStatus() {


        double bodyMaxIndex = 0.0;

        //  int index = Integer.parseInt(scanner.nextLine());
        if (bodyMaxIndex <= 18.5) {
            System.out.println("underweight");

        } else if (bodyMaxIndex <= 25) {
            System.out.println("normal");

        } else if (bodyMaxIndex <= 30) {
            System.out.println("overweight");

        } else if (bodyMaxIndex > 30) {
            System.out.println("obese");
        }
    }

    //7. Създайте метод ReportResults, който приема като параметри: пореден номер на резултата, BMI индекс, статус.
    // Той трябва да изведе на конзолата подходящо съобщение,
    // с което уведомява, че човекът с номер Х има BMI= х.х, закръглен до втория знак. За закръглянето изпозлвайте Math.round(BMI);

    public static void ReportResults() {
        Scanner scanner = new Scanner(System.in);

        int numberResult = Integer.parseInt(scanner.nextLine());
        int bmiIndex = Integer.parseInt(scanner.nextLine());
        String status = scanner.nextLine();

        System.out.printf("The person with number %.2d  have %.2d = %s  ", numberResult, Math.round(bmiIndex), status);

    }


    //8. В main метод на програмата създайте Scanner, който чете от стандартен вход, подайте го към getBM(),
    // после по върнатия от него резултат вземете статуса с метод getStatus() и извикайте метода reportResults(),
    // за да изведете дан итe.


}
