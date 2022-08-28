package Upr_1;

public class Zad2 {

    // public static void printName(String s) {
    //   System.out.println(s);
    //}

    //public static void main(String[] args) {
    // String name = "Ivan";
    // String name ; - doesn't work , because I must da se initialize
    //  .printName(name);
    //}
    // private - method/ function , access

    // modifiers = public , private, default

    // static -

    // ime na object . ime na method

    // =======================================================================================

  /*
  public static void printName(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int y = 1;
        printName(y);
        System.out.println(y);
    }

   */

    /*
    public static void printName(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void main(String[] args) {
        int[]test = {1,2,3};
        printName(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

     */

    public static void main(String[] args) {
        int x = 3;
        //addFive(x);
        addFive(x);
        System.out.println("x = " + x);
    }

    private static int addFive(int x) {
        x += 5;
        return x;
    }


}
