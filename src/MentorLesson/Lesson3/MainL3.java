package MentorLesson.Lesson3;

import java.util.Scanner;

public class MainL3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = {1, 2, 45, 3, 42, 87};
        int dub = array[0];
        boolean result = false;
        for (int i = 1; i < array.length; i++) {
            if (dub == array[i]) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < args.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println(array[k]);
        }

        for(int i = 0; i< array.length; i++){
            for(int j = i +1; j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println(true);;
                }
                break;
            }
        }
        System.out.println(false);
    }

    public static void printSquare(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printSquareTriangle(int number){

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    int getfibonacci(int number) {
        if( number == 0 || number == 1){
            return 1;
        }
        return getfibonacci(number -1) + getfibonacci(number -2);

    }
}