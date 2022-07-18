package file_io.input_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Readsample3 {

    public static void main(String[] args) {

        try(InputStream is = new FileInputStream("C:/File/test3.db")){

            byte[] arr = new byte[5];

            while (true){
                int data = is.read(arr,1,3);
                if (data == -1)break;
                for (int i = 0; i <arr.length ; i++) {
                    System.out.println(arr[i]);
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }


    }
}


