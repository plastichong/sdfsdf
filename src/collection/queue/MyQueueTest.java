package collection.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue("wee1");
        queue.enQueue("wee2");
        queue.enQueue("wee3");

        System.out.println("자료 사이즈 : "+queue.getArrayQueue().size());

        System.out.println("첫 번째 꺼내옴 :"+queue.deQueue());
        System.out.println("두 번째 꺼내옴 :"+queue.deQueue());
        System.out.println("세 번째 꺼내옴 :"+queue.deQueue());
        System.out.println("네 번째 꺼내옴 :"+queue.deQueue());

        System.out.println("자료 사이즈 : "+queue.getArrayQueue().size());
    }
}
