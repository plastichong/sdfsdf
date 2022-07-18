package file_io.decorator.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("animal.text");
             BufferedReader br = new BufferedReader(fr)
        ) {

            String[] animal = null;
            while (true) {
                String data = br.readLine();
                if (data == null) break;
                animal = data.split(" ");
            }

            int num = (int) (Math.random()* animal.length);
            System.out.println(animal[num]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
