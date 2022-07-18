package file_io.decorator.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 10000000L;

    private String name;
    private String job;

    public Person(){}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
