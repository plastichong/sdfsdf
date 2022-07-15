package file_io.output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample2 {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("C:/File/test2.db");


            byte[] byteArr = new byte[]{10, 20, 30};

            os.write(byteArr);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.flush();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
