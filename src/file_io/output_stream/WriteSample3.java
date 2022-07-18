package file_io.output_stream;

import java.io.*;

public class WriteSample3 {
    public static void main(String[] args) {

        OutputStream os = null;
        try {
             os = new FileOutputStream("C:/File/test3.db");

             byte[] arr = new byte[]{10,20,30,40,50};
             os.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.flush();
                os.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }


    }
}
