package MainLesson.Lesson9;

import java.util.Arrays;

public class Lesson9 {
    int count;
    static int count1;

    public static void main(String[] args) {
//        Lesson9 lesson9 = new Lesson9();
//        System.out.println(lesson9.count);  //instance variable

//        Lesson9.count1++;
//        System.out.println(Lesson9.count1);  // static variable

//        Lesson9 lesson9 = new Lesson9();
//        lesson9.count++;
//
//        Lesson9 lesson9_1 = new Lesson9();
//
//        System.out.println(lesson9.count);
//        System.out.println(lesson9_1.count);

//        Lesson9.getName();  // static method


        String name = "      Daniel Riccardo      ";

        System.out.println(name.isEmpty()); // show emptiness

        System.out.println(name.isBlank()); //show blankness

        System.out.println(name.equals("Daniel riccardo")); // shows equals or not. case sensitive

        byte[] stringbyte = name.getBytes();
        System.out.println(stringbyte);
        System.out.println(Arrays.toString(stringbyte));

        System.out.println(name.trim()); // remove strats and end spaces

        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        for(String str: name.split("i")){   //split String according given string
            System.out.println(str);
        }

        System.out.println(name.contains("w"));

        System.out.println(name.replace("Daniel", "Max"));

        System.out.println(name.indexOf('a')); // shows first index
        System.out.println(name.lastIndexOf('a')); // shows last index

        System.out.println(name.startsWith(" "));
        System.out.println(name.endsWith("Ma"));

        System.out.println(name.charAt(7)); // shows char at the index

        System.out.println(name.substring(7));
        System.out.println(name.substring(7,14));
        String sub = name.substring(7,10);

        System.out.println(name.concat(" F1 driver")); // to connect strings

        System.out.println(name.equalsIgnoreCase("      daniel riccardo      "));

        int a = 5;
        String number = String.valueOf(a); // casts int to String
        System.out.println(number);
    }
}
