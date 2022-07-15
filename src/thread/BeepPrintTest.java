package thread;

import javax.tools.Tool;
import java.awt.*;

public class BeepPrintTest {
    public static void main(String[] args) {
        //1초간격
        for (int i = 0; i < 5; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
