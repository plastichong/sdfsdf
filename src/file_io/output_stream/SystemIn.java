package file_io.output_stream;

import java.io.IOException;

public class SystemIn {
    public static void main(String[] args) {
        System.out.println("여러개의 문자를 입력하고 [Enter]를 누르세요");

        int readByte; // 문자의 코드값

        try {
            while (true) {
                if ((readByte = System.in.read()) != -1)

                System.out.print((char)readByte);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
