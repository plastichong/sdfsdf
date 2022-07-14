package collection.queue;

public class Message {
    public String command;
    public String to;

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Message{" +
                "command='" + command + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
