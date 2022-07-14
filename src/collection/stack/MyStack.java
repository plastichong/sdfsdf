package collection.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> list;

    public MyStack() {
        this.list = new ArrayList<>();
    }

    public void push(String data){
        list.add(data);
    }

    public String pop(){
        int lastIdx = list.size()-1;
        if (lastIdx == 0){
            System.out.println("stack is empty!");
            return null;
        }
        return list.remove(lastIdx);
    }

}
