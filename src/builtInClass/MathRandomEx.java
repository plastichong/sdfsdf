package builtInClass;

public class MathRandomEx {
    public static void main(String[] args) {
        System.out.println("주사위 10번 던지기");
        for (int i = 1; i <=10 ; i++) {
            int dice = (int)(Math.random()*6)+1;
            System.out.print(dice+", ");
        }
        System.out.println();
        String[] word = {"너","나","우리","우주"};
        int num = (int)(Math.random()* word.length);
        System.out.println(word[num]);
    }
}
