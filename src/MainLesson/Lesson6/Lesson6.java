package MainLesson.Lesson6;

import MainLesson.Lesson5.Fruit;

public class Lesson6 {
    int coin = 6;
    String name = "Someone";
    Fruit fruit = new Fruit();


    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        Lesson6 lesson6 = new Lesson6();
        int c = lesson6.sum(a, b);
        System.out.println(c);
        System.out.println(lesson6.coin);

        Lesson6 lesson6Two = new Lesson6();
        lesson6Two.coin = 7 ;
        System.out.println(lesson6Two.coin);

        Lesson6 lesson6Three = new Lesson6();
        new Lesson6();

//        while(true){
//            System.out.println(lesson6.sum(a, b));
//        }
    }

    int sum(int n, int m) {
//        String name = "someone";
//        return n + m;
        if(n> 10) {
            return sub(n, m);
        }

        return n+ m;
    }
    int sub(int n, int m){
        return sum(n, m);
    }

}
