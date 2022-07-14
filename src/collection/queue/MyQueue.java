package collection.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<String> arrayQueue;

    public List<String> getArrayQueue() {
        return arrayQueue;
    }

    public MyQueue() {
        this.arrayQueue = new ArrayList<>();
    }

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {

        if (arrayQueue.size() == 0) {
            System.out.println("queue is empty!");
            return null;
        } else {
            return arrayQueue.remove(0);
        }

    }
}
