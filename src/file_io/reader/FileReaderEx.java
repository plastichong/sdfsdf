package file_io.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx {
    public static void main(String[] args) {

        try (Reader fr = new FileReader("file1.txt")){
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char) i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
