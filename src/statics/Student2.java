package statics;

public class Student2 {

    private static int seriaNum = 100; //기준 번호
    private int id;
    private String name;

    public Student2(){
        seriaNum++;
        this.id = seriaNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
