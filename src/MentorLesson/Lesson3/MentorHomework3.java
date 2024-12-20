package MentorLesson.Lesson3;

import java.util.Scanner;

public class MentorHomework3 {
    public static void main(String[] args) {
        int[] array = {23, 45, 0, 12, 22, 1, 56};
        MentorHomework3 mentorHomework3 = new MentorHomework3();
        System.out.println("Arrey's average is " + mentorHomework3.getArrayAverage(array));


        System.out.println("-------------------");
        int[] array2 = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            }
            int a = array[i];
            array2[i] = a;
            System.out.println(a);
        }
        System.out.println(array2[array.length]);

        System.out.println("------------------");


    }

    // Array Average
    int getArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    double getArrayAverage(int[] array) {
        double average = (double) getArraySum(array) / (double) array.length;
        return average;
    }



}





