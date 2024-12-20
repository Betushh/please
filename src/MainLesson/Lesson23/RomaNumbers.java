package MainLesson.Lesson23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomaNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter your Roma Number: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        getRum(a);

    }

    public static void getRum(String rum) {

        Map<String, Integer> uniqueMap = new LinkedHashMap<>();
        uniqueMap.put("IV", 4);
        uniqueMap.put("IX", 9);
        uniqueMap.put("XL", 40);
        uniqueMap.put("XC", 90);
        uniqueMap.put("CD", 400);
        uniqueMap.put("CM", 900);

        int sum = 0;
        String newRum = rum;
        for (String i : uniqueMap.keySet()) {
            while (newRum.contains(i)) {
                sum += uniqueMap.get(i);
                newRum = newRum.replaceFirst(i, "");
            }
        }


        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int mapSum = 0;
        for (Character i : newRum.toCharArray()) {
            mapSum += map.get(i);
        }

        int result = sum + mapSum;
        System.out.println(" Your Roma Number value is: " + result);


    }
}
