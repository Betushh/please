package MainLesson.Lesson18;

public class RunnableThread implements Runnable {
    private String name;
    private volatile int a = 1;

    public RunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        synchronized (this){
        for(int i = 0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        }
    }

    public void getData() {
        String dataName = Thread.currentThread().getName();
        System.out.println(dataName);

        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(dataName + " : " + i);
            }
        }
    }
}
