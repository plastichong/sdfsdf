package file_io.decorator;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        String origin = "C:/File/bg0.jpg";
        String copy = "C:/File/bgCopy.jpg";

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copy));
                //Buffered~Stream -- 보조 스트림
                //File~Stream -- 기반 스트림
                // 보조 스트림(기반 스트림)
        ) {
            start = System.currentTimeMillis();
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            end = System.currentTimeMillis();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("소요시간 : "+(end-start)+"ms");

    }
}
