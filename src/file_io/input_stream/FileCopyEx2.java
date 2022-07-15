package file_io.input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx2 {
    public static void main(String[] args) {
        String originFile = "C:/File/bg0.jpg";
        String copyFile = "C:/File/bg2.jpg";

        try (FileInputStream fis = new FileInputStream(originFile);
             FileOutputStream fos = new FileOutputStream(copyFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
