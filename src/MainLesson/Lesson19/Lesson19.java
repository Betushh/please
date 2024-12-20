package MainLesson.Lesson19;

import MainLesson.Lesson10.Films.Film;
import MainLesson.Lesson11.Polymorphism.Animal;

public class Lesson19 {
    public static void main(String[] args) {

        System.out.println(Weekdays.MONDAY.name());
        System.out.println(Weekdays.MONDAY.compareTo(Weekdays.FRIDAY));
        System.out.println(Weekdays.values()[3]);
        System.out.println(Weekdays.MONDAY.getIndex());
        System.out.println(Weekdays.MONDAY.getNickName());
        System.out.println(Weekdays.MONDAY.getDay());

        /*
        int a = 3;
        String name = "Amara";

        var a1 = 3; //not allowed to use as instance variable, cannot use in method parameter / not allowed to be static
        var name1 = "Amara";
        var object = new Animal();
        var array = new int[]{1, 2, 3, 4};
        var = null; cannot be null

        var q;
        q=3;
        not allowed



        String name = "Amara";
        String subNAme = name.substring(3);
        System.out.println(subNAme);
        System.out.println(name);

        StringBuilder builder = new StringBuilder("Amara");
        builder.append(" Maroni");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer("Amara");//Thread safe
        buffer.append(" Maroni");
        System.out.println(buffer);
         */

    }
}
