package Upr_2;

import java.util.Scanner;

public class Ex2_tryings {

    double heightInc;
    double weightLb;
    double bmi;


    public static void printIntroduction() {

        System.out.println("This is a BMI Calculator");
    }


    public static void main(String[] args) {
        printIntroduction();
        getBMI();
    }


    public static void getBMI() {
        Scanner s = new Scanner(System.in);
        System.out.println("Put in height");
        double result = 0;
        String status = null;
        double height1 = s.nextInt();
        double heightinc = height1 * 0.3937;
        System.out.println("Put in weight");
        double weight1 = s.nextInt();
        double weightlb = weight1 * 2.2046;

        //System.out.println("height in inc " + heightinc);
        //System.out.println("Weight in lb " + weightlb);


        result = bmiFor(heightinc, weightlb);
        System.out.println("Your BMI is: " + Math.round(result));
        status = getStatus(result);
        System.out.println("Your Status is: " + status);


    }

    public static double bmiFor(double height2, double weight2) {
        double bmi = (weight2 * 703) / (height2 * height2);
        return bmi;

    }

    public static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi <= 25)
            return "Normal";
        else if (bmi <= 30)
            return "Overweight";
        else
            return "Obese";
    }


    public void ReportResults() {

    }


}

