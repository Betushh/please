package MainLesson.Lesson13;

import MainLesson.Lesson13.Homework13.Believer;
import MainLesson.Lesson13.Homework13.HashCode;
import MainLesson.Lesson13.Homework13.Religion;

public class Lesson13 extends HashCode implements Religion, Believer {// 1 extends, endless implements

    @Override
    public void getHuman(int i) {
        System.out.println(Believer.a);

    }

    @Override
    public void Buddhism() {
        System.out.println("This is Buddhism method");
    }


    @Override
    public void Christian(String name) {
        if (name.equalsIgnoreCase("Bible")) {
            System.out.println("Christians book name is" + name);
        } else {
            System.out.println("You give us wrong book");
        }
    }

    @Override
    public void getName() {
        System.out.println("Name");
    }

    public static void main(String[] args) {


        Lesson13 lesson13 = new Lesson13();
        lesson13.Buddhism();
        lesson13.Christian("Quran");
        System.out.println(Lesson13.name);
        System.out.println(Religion.Islam("QUran"));
        lesson13.getName();

        Believer believer = new Believer() { // like abstract class object
            @Override
            public void getHuman(int i) {

            }
        };
        believer.getName();


        HashCode hashCode = new HashCode();
        hashCode.setType("Furniture");
        hashCode.setUsefulLife("3 years");


        HashCode hashCode1 = new HashCode();
        hashCode1.setType("Furniture");
        hashCode1.setUsefulLife("3 years");


        System.out.println("Hashcode equals to " + hashCode.hashCode());
        System.out.println("Hashcode1 equals to " + hashCode1.hashCode());
        System.out.println(hashCode.equals(hashCode1));

    }


}


