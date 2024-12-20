package MainLesson.Lesson18;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Homework18 {
    static int[] array = new int[100];


    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }


        HomeworkThread homeworkThread;
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        int number = 20;
        for (int i = 0; i < 5; i++) {
                int first = i * number;
                int last = first + number;
                homeworkThread = new HomeworkThread(array,first,last);
                executorService.execute(homeworkThread);


            }

            executorService.shutdown();

//        for(int a: array){
//            System.out.println(a);
//        }

        }



    }

