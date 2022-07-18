package file_io.input_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Readsample2 {

    public static void main(String[] args) throws IOException {
        //data 가  test1.db 인 바이트 배열 기반 파일 입력 스트림
        InputStream is = null;

        try {
//            is = new FileInputStream("C:/File/test1.db");
//            byte[] buffer = new byte[100];
//            int data;
//
//            while ((data = is.read(buffer)) != -1) {
//                for (int i = 0; i < data; i++) {
//                    System.out.println(buffer[i]);
//                }
//
//            }

            while(true){
                int data = is.read();
                if(data == -1)break;
                for (int i = 0; i < data ; i++) {
                    System.out.println();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}


