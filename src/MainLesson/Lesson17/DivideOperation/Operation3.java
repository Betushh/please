package MainLesson.Lesson17.DivideOperation;

public class Operation3 extends Thread{
    private int[] array;

    public Operation3(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 3 == 2) {
                System.out.println(Thread.currentThread().getName()+ array[i]);
            }
        }
    }
}
