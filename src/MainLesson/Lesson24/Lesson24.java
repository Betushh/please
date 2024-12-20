package MainLesson.Lesson24;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Lesson24 {
    public static void main(String[] args) {
        List<Human> humans = List.of(new Human("Human1",12),
                                     new Human("Human2",22),
                                     new Human("Human3",45)
                );

        List<String> humanName = humans.stream().map(human-> human.getName()).toList();

        humanName.forEach(name-> System.out.println(name));


     //   List<Integer>
        int[] a = {4, 8, 0, 3};
        int[] b = {7, 81, 10, 3};
        String[] s = {"we", "they"};

      //  java.awt.List
    }
}
