package additional_Exercises.FILES;

import java.io.*;

public class Test2 {

    public static void main(String[] args) {
        try {
            byte[] array = {1, 2, 3, 4, 5};
            OutputStream os = new FileOutputStream("test2.txt");
               for(int i = 0; i < array.length; i++){
                   os.write(array[i]);
                }
                os.close();

               InputStream is = new FileInputStream("test2.txt");
               int size = is.available();
               for(int i =0 ; i< size; i++){
                    System.out.println(is.read() + " ");
                }
               is.close();
            } catch(IOException e){
                System.err.print("Exception");
                e.printStackTrace();
            }

    }
}
