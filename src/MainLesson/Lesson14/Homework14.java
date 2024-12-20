package MainLesson.Lesson14;

public class Homework14 {
    public static void main(String[] args) {
        int[] array = {23, 66, 22, 4, 23, 0, 12};
        //int[] array = {0,3,5,0,--,0,--};
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            try {
                newArray[i] = array[i] / array[i + 1];
            } catch (ArithmeticException e) {
                newArray[i] = 1;
            } catch (IndexOutOfBoundsException a) {
                newArray[i] = -1;
            } catch (Exception ex) {
                System.out.println("We have a problem in Array");
            }
            System.out.println(newArray[i]);
        }
    }
}
