package MainLesson.Lesson18;

public class HomeworkThread implements Runnable {
    private int[] array;
    private final int first;
    private final int last;


    public HomeworkThread(int[] array, int first, int last) {
        this.array = array;
        this.first = first;
        this.last = last;
    }

    @Override
    public void run() {
        getArray();
    }

    public void getArray() {
        String name = Thread.currentThread().getName();

        synchronized (this) {
            for (int i = first; i < last; i++) {
                array[i] -= 10;
                System.out.println(name + " : " + array[i]);
            }
        }

    }

}