package MainLesson.Lesson18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson18 {
    public static void main(String[] args) throws InterruptedException {

        RunnableThread runnableThread ;

 //       ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i<6;i++){
        runnableThread = new RunnableThread("My Data");

        executorService.execute(runnableThread);

        }
        executorService.shutdown();

    }
}
