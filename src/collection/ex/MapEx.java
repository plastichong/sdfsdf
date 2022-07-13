package collection.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        Set<String> keySet = map.keySet();

        Iterator<String> iterator = keySet.iterator();


        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            System.out.println(key + " : " + value);

            if (map.get(key) < map.get(key)) {
            }

        }
    }
}
