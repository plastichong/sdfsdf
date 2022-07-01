package example;

public class ForEx {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        boolean run = true;
        while (run) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            System.out.println(dice1 + ", " + dice2);
            if ((dice1 + dice2) == 5) {
                System.out.println("종료");
                run = false;
            }
        }
        String st = new String();
        String st2 = new String();

//        st = "g";
//        st2 = "g";

        System.out.println(st);


    }
}
