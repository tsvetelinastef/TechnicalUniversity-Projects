package additional_Exercises;

public class Files {
    //defining a method
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;

    }
    //main method
    public static void main(String[] args) {
        Files obj = new Files();
        try {
            System.out.println(obj.divideNum(45, 0));
        }
        catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
}

/*
TestThrow.java

    public class TestThrow {
        //defining a method
        public static void checkNum(int num) {
            if (num < 1) {
                throw new ArithmeticException("\nNumber is negative, cannot calculate square");
            }
            else {
                System.out.println("Square of " + num + " is " + (num*num));
            }
        }
        //main method
        public static void main(String[] args) {
                TestThrow obj = new TestThrow();
                obj.checkNum(-3);
                System.out.println("Rest of the code..");
        }
    }
 */