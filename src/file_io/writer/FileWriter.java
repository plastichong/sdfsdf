package file_io.writer;

import java.io.IOException;
import java.io.Writer;

public class FileWriter {
    public static void main(String[] args) {
        //문자 파일 기반 출력스트림 생성


        try(Writer fw = new java.io.FileWriter("file1.txt")){
            fw.write("Hello~ java!\n"); //문자열 쓰기
            fw.write("안녕하세요\n");
            fw.write(65);
            fw.write(10);
            char[] buf = {'s','m','i','l','e'};
            fw.write(buf);

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("수행완료");

    }
}
