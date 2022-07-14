package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEX {
    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<>();

        Message mail = new Message("sendMail","wee");
        Message sms = new Message("sendSms","wee");
        Message kakaoTalk = new Message("sendKakaoTalk","wee");

        messageQueue.offer(mail);
        messageQueue.offer(sms);
        messageQueue.offer(kakaoTalk);

        while(!messageQueue.isEmpty()){
            System.out.println(messageQueue.poll());
        }


    }
}
