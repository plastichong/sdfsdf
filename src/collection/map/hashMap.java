package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("이순신", 85);
        map.put("홍길동", 90);
        map.put("강감찬", 80);
        map.put("이순신", 75);

        System.out.println(map.size());
        System.out.println(map.get("이순신"));

        Set<String> keySet = map.keySet();

        Iterator<String> iterator = keySet.iterator();


        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }

        map.remove("강감찬");
        System.out.println(map.size());

        System.out.println(map.containsKey("이순신")); //해당 키값 존재유무





    }
}
