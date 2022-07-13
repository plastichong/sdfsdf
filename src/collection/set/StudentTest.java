package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

//        Student wee1 = new Student("wee",28);
//        Student wee2 = new Student("wee",28);
//        Student wee3 = new Student("wee",28);


        studentSet.add(new Student("wee",28));
        studentSet.add(new Student("wee",28));
        studentSet.add(new Student("wee",28));

//        studentSet.add(wee1);
//        studentSet.add(wee2);
//        studentSet.add(wee3);

        System.out.println(studentSet.size());
    }
}
