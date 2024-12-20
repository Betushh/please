package MainLesson.Lesson23;


import MainLesson.Lesson10.Moviecompanies.Companies;

import java.util.*;

public class Lesson23 {
    public static void main(String[] args) {

        //1 Hashset
        Map<String, Integer> map = new HashMap<>();//hashMap does not storage data, can keep null data,
        map.put("aa", 1);
        map.put("aab", 12);
        map.put("aabc", 221);
        map.put("aabc", 221);
        map.put(null, 90);
        map.put("aabc", 254);

        for (String i : map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }


        //2 LinkedHashSet
        Map<String, Integer> linked = new LinkedHashMap<>();// insertion order
        linked.put("a", 2);
        linked.put("b", 2);
        linked.put("a", 3);
        linked.put("ww", 3);
        linked.put(null, 3);

        for (String i : linked.keySet()) {
            System.out.println(i + " : " + linked.get(i));
        }

        Map<String, Integer> tree = new TreeMap<>();// null no, ascending order according to keys
        tree.put("a", 2);
        tree.put("b", 2);
        tree.put("a", 3);
        tree.put("ww", 3);

        for (String i : tree.keySet()) {
            System.out.println(i + " : " + tree.get(i));
        }


        getSize(List.of(new Companies()));
    }

    static void getSize(List<?> list) {
        System.out.println(list.size());


    }
}
