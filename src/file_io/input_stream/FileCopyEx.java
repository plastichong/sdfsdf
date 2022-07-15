package file_io.input_stream;

import java.io.*;

public class FileCopyEx {
    public static void main(String[] args) {
        String originFile = "C:/File/bg0.jpg";
        String copyFile = "C:/File/bg1.jpg";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        //파일 읽기
        try {
            fis = new FileInputStream(originFile);
            fos = new FileOutputStream(copyFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
