package additional_Exercises;

import java.util.Arrays;
import java.util.Scanner;

//  Encrypt, Sort and Print Array
public class random_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namesCount = Integer.parseInt(scanner.nextLine());

        String[] names = new String[namesCount];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        int[] encryptedNames = new int[namesCount];


        for (int j = 0; j < names.length; j++) {
            String name = names[j];
            // for (String name : names) {
            int currentNameSum = 0;



            for (int i = 0; i < name.length(); i++) {
                char currentLetter = name.charAt(i);

                if (checkLetterIsVowel(currentLetter)) {
                    currentNameSum += currentLetter * name.length();
                } else {
                    currentNameSum += currentLetter / name.length();
                }

                //   currentNameSum +=  ...; ---> не ни трябва
            }

            encryptedNames[j] = currentNameSum;
        }

       Arrays.sort(encryptedNames);
      //encryptedNames =  Arrays.sort(encryptedNames); - това проверяваме ,
      // като кликнем върху sort и в отделен клас ни изписва подробности за функцията

        printResult(encryptedNames);
    }
// System.out.println();

// Всички методи в мейн са статични - static
// public static boolean checkLetterIsVowel(char letter)  --> първо беше , с public
    private static boolean checkLetterIsVowel(char letter) {
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            if (vowel == Character.toLowerCase(letter)){
                return true;
            }
        }
        return false;
    }

    // и тук ... public static void printResult(int[] values)
    private static void printResult(int[] values){
        for (int value : values) {
            System.out.println(value);

        }
    }
}
