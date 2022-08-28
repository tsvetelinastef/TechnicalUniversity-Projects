package additional_Exercises.FILES;

import java.io.File; //  импортваме го това , за да извършваме операции
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        // използваме try/ catch - блок , за да хване EXCEPTION- a
        try{
            File file = new File("newFile.txt");
            boolean isCreated = file.createNewFile();
            if (isCreated){
                System.out.println("The file has been created");
            } else{
                System.out.println("File already exists!");
            }
        } catch (IOException e){
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
