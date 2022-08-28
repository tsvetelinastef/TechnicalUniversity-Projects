import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String str){
       // if length is 0 or 1 then String is palindrome
        if (str.length() == 0 || str.length() == 1)
            return true;

    /*
        check if the first and the last symbols are equal. and continue with
        the next internal couple of symbols.
    */

        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        return  false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // read the string
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        if (isPalindrome(string)){
            System.out.println(string + " is a palindrome");
        }
        else {
            System.out.println(string + " is not a palindrome");
        }

    }

}

/*
 public static boolean isPalindrome(char[] word){
        int firstIndex = 0;
        int lastIndex = word.length - 1;

        while (lastIndex > firstIndex){
            if (word[firstIndex] != word[lastIndex]) {
                return false;
            }
            ++firstIndex;
            --lastIndex;
        }
        return true;
    }
 */
