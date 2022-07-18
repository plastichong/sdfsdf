package file_io.decorator.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteEx {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("animal.text");
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("cat");
            bw.write(32);
            bw.write("dog");
            bw.write(32);
            bw.write("chicken");
            bw.write(32);
            bw.write("pig");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
