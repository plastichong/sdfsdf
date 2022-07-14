package collection.stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("wee1");
        stack.push("wee2");
        stack.push("wee3");
        stack.push("wee4");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
