package MentorLesson.Lesson2;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] array = {3, 56, 77, 23, 22, 53, 122};
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 2; j < array.length / 2; j++) {
                if (array[i] % j == 0) {
                    continue;
                }
                System.out.println("Prime number is = " + array[i]);
            }
        }
    }
}

