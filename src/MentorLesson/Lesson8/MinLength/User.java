package MentorLesson.Lesson8.MinLength;


public class User {
    @MinLength(7)
   private String name;

    public User(String name){
        this.name = name;
    }
}
