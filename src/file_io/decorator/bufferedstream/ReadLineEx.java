package file_io.decorator.bufferedstream;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;

public class ReadLineEx {
    public static void main(String[] args) throws IOException {
        //줄 단위로 문자 읽기
        //BufferedReader == 보조스트림

        Reader fr = new FileReader("reader.txt");//기반 스트림
        BufferedReader br = new BufferedReader(fr);

        while (true){
            String data = br.readLine();
            if (data == null)break;
            System.out.println(data);

        }

    br.close();




    }
}
