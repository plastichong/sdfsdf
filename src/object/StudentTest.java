package object;

import java.util.HashMap;
import java.util.Hashtable;

public class StudentTest {
    public static void main(String[] args) {

        //Student == key
        //Integer == 값
        HashMap<Student,Integer> hashmap = new HashMap<>();

        hashmap.put(new Student("1"),95);
        hashmap.put(new Student("2"),88);

        int score = hashmap.get(new Student("1"));
        int score2 = hashmap.get(new Student("2"));
        System.out.println(score);
        System.out.println(score2);

//        System.out.println(hashmap.get(new Student("1")));





    }
}
