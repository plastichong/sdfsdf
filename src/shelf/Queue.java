package shelf;

public interface Queue {
    //queue
    //선입 선출  FIFO first in first out

    void enQueue(String title); //리스트의 맨 뒤에서 추가

    String deQueue();   //리스트의 맨 앞에서 반환

    int getSize(); // queue 에 있는 요소의 개수 반환
}
