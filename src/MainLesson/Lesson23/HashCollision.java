package MainLesson.Lesson23;

import java.util.HashMap;
import java.util.Map;

public class HashCollision {


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Furniture", 0);
        map.put("Furniture", 5);
        map.put("Addision", 4);

        for (Object key : map.keySet()) {
            System.out.println(key + " : " + key.hashCode());
        }


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        return true;
    }

    @Override
    public int hashCode() {
            return 17;

    }



}
