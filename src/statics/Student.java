package statics;

public class Student {

    static int seriaNum = 100; //기준 번호
    int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
