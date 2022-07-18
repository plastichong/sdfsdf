package file_io.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {
    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dos = new DataInputStream(fis)
        ) {

            System.out.println(dos.readByte());
            System.out.println(dos.readChar());
            System.out.println(dos.readInt());
            System.out.println(dos.readFloat());
            System.out.println(dos.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
