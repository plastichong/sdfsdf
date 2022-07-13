package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        set.add("Java");
        set.add("JDBC");
        set.add("JSP/servlet");
        set.add("JSP/servlet");
        set.add("MyBatis");

        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        set.remove("JDBC");
        System.out.println(set.size());

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            System.out.println(element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }
        System.out.println(set.size());
    }
}
