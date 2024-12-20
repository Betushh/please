package MainLesson.Lesson7;

public class Lesson7 {

    void getDetail(Planets planets) {
        planets = new Planets("Mars", "Orbit");
        System.out.println(planets.name);
        System.out.println(planets.orbit);
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        Planets planets = new Planets();
        Lesson7 lesson7 = new Lesson7();
        lesson7.getDetail(planets);
        System.out.println(planets.name);
        System.out.println(planets.orbit);


//        Homework7 homework7 = new Homework7();
//        System.out.println(homework7.form);
//
//        System.out.println("------------------");
//
//        Homework7 homework8 = new Homework7(12);
//        System.out.println(homework8.leftime);
//
//        System.out.println("------------------");
//
//        Homework7 homework9 = new Homework7(24,"human", true);

    }

}
