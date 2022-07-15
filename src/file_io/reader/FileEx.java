package file_io.reader;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\File\\newFile.txt");

        //crate file

        file.createNewFile();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getPath());

        //File 클래스.// 입,출력 기능은 없으나 파일이름,파일경로 등을 알 수 있음


    }
}
