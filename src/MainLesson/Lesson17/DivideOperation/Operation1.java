package MainLesson.Lesson17.DivideOperation;

public class Operation1 extends Thread  {
    private int[] array;


    public Operation1(int[] array) {
        this.array = array;

    }

    @Override
    public void run() {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(Thread.currentThread().getName()+ array[i]);
            }
        }
    }
}