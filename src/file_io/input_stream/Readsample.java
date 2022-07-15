package file_io.input_stream;

import java.io.*;

public class Readsample {

    public static void main(String[] args) throws IOException {
    //data 가  test1.db 인 바이트기반 파일 입력 스트림
    InputStream is = new FileInputStream("C:/File/test1.db");

    int readByte;
    while ((readByte = is.read()) != -1){

        System.out.println(readByte);
    }


    }


}
