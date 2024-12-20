package MainLesson.Lesson17.MyThread;

public class Lesson17 {
    public static void main(String[] args) throws InterruptedException {
//
//        ThreadGroup group = new ThreadGroup("My group");
//        MyRunnableThread runnableThread = new MyRunnableThread();
//        Thread thread3 = new Thread(group ,runnableThread, "Nikolai");
//        Thread thread4 = new Thread(group ,runnableThread, "Andrew");
//        Thread thread5 = new Thread(group ,runnableThread, "Heseneli");
//
//        System.out.println(thread3.getThreadGroup().getName());
//
//
//        thread3.start();
//        thread4.start();
//        thread5.start();
//
//        System.out.println(group.activeCount());



        Thread thread0 = new MyThread();
        thread0.setPriority(Thread.MAX_PRIORITY);
//        thread0.setDaemon(true);
        Thread thread1 = new MyThread();
        thread1.setPriority(Thread.NORM_PRIORITY);
//        thread1.setName("Sebastian");
        Thread thread2 = new MyThread();
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setName("Theodor");

//        thread0.start();
//
//        thread1.start();
//        thread0.join(1000);
        thread2.start();

        //place them systematically in call stack
//        thread0.run();
//        thread1.run();
//        thread2.run();
    }
}
