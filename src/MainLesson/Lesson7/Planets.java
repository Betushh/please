package MainLesson.Lesson7;

import java.sql.SQLOutput;

public class Planets {
    String name;
    String orbit;

    public Planets() {
        this("Earth");
//        System.out.println("Hello from Animal class");
//        name = "Mars";
  //      System.out.println("No arg constructor");
    }

    public Planets(String name) {
  //      this(name, "other Orbit");
        this.name = name;
  //      System.out.println("1 arg constructor");
    }

    public Planets(String name, String orbit) {
        this.name = name;
        this.orbit = orbit;
 //       System.out.println("2 arg constructor");
    }

    public static void main(String[] args) {
        Planets planets = new Planets();
        System.out.println("----------------");
        Planets planets1 = new Planets("Uranus");
        System.out.println("----------------");
        Planets planets2 = new Planets("Venus", "Some Orbit");
        //       new Planets();    // No arg constructor



    }




}

