package MainLesson.Lesson8;

public class Homework8 {
    public static void main(String[] args) {

        for(int i = 0; i< 3;i++){
            GarbageCollector garbageCollector = new GarbageCollector("Our Trash");
            garbageCollector = null;

            System.gc();

            System.out.println("Trash is found");
        }
        System.out.println("Trash searching is finished");
    }





}
