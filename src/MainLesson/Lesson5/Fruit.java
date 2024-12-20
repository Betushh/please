package MainLesson.Lesson5;

public class Fruit {
    String name = "Apple";
    int weight = 1;
    String color = "green";

    {
        String clr = "red";
        color =clr;

    }
 //   String color2 = clr; we cant use it

    void sayHello() {
        System.out.println("Hello from fruit class!");
    }

    String getCountry() {
        return "Brazil";
    }

    int getCalorie(int height, int width){  //local variables
        int rate = 2;
       return height * width * rate;
    }
}
