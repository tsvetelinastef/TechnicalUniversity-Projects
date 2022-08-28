package additional_Exercises.FILES;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try{
            String text = "Some text...";
            File file = new File("newFile.txt");
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.flush();
            System.out.println("Ready!");
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
                if (bufferedWriter != null){
                    fileWriter.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
