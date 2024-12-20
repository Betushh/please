package MainLesson.Lesson8;

public class GarbageCollector {

    String ourTrash;

public GarbageCollector(String ourTrash){
    this.ourTrash = ourTrash;
    }

    public void finalize(){
        System.out.println(" deleted");
    }

}
