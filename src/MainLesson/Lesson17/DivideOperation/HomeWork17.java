package MainLesson.Lesson17.DivideOperation;


public class HomeWork17 {
    static int[] array = new int[100];


    public static void main(String[] args) {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i + 1;
        }
        Thread o1 = new Operation1(array);
        o1.setName("Qaliq 0 ");


        Thread o2 = new Operation2(array);
        o2.setName("Qaliq 1 ");


        Thread o3 = new Operation3(array);
        o3.setName("Qaliq 2 ");


        o1.start();
        o2.start();
        o3.start();
    }



}
