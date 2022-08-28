package additional_Exercises.FILES;

import java.io.*;

public class Test1 {

    public static void main(String[] args) {

        FileInputStream in = null; //  FileReader
        FileOutputStream out = null; // FileWriter

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int x;
            while ((x = in.read()) != -1){
                out.write(x);
            }
        } catch (IOException e){
            System.err.println("Error reading file");
        } finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (java.io.IOException e){
                e.printStackTrace();
            }
        }
    }
}
