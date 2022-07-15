package file_io.output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {
    //output stream, File output Stream 클래스 사용
    //data 가  test1.db 인 바이트기반 파일 출력 스트림
    public static void main(String[] args) throws IOException {

    OutputStream os = new FileOutputStream("C:/File/test1.db");

    byte a = 10;
    byte b = 20;
    byte c = 30;

    os.write(a);
    os.write(b);
    os.write(c);

    os.close();
    os.flush();


    }


}
