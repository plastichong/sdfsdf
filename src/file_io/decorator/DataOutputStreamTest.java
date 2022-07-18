package file_io.decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        //자료형이 그대로 유지
        //보조 스트림(기반스트림)

        try (
                FileOutputStream fos = new FileOutputStream("data.txt");
                DataOutputStream dos = new DataOutputStream(fos)
        ) {
            dos.writeByte('C');
            dos.writeChar('나');
            dos.writeInt(48);
            dos.writeFloat(2.54f);
            dos.writeUTF("감사합니다.");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
