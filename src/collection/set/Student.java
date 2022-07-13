package collection.set;

import java.util.Objects;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student){
            Student student = (Student) o;
            if (student.name.equals(name) && student.age == age){
                return true;
            }
        }
        return false;
    }




    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
