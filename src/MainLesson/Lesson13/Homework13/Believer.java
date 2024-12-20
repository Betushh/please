package MainLesson.Lesson13.Homework13;

public interface Believer {
    int a = 12; // public final static
    void getHuman(int i); // public abstract

    default void getName(){
        System.out.println("Name");
    }

}
