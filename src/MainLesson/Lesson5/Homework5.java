package MainLesson.Lesson5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//3
        int fac = calculator.getFactorial(n);
        System.out.println(fac);
        int s = calculator.getMaxAndMeanMultiple(3,4,7);
        System.out.println(s);


    }
}
