package MentorLesson.Lesson8.EntityInfo;


public class EntityUser {
    @EntityInfo(name = "Human", version = 4)
    private String name;
    @EntityInfo(name = "Human", version = 4)
    private int value;

    public EntityUser(String name, int value){
        this.name = name;
        this.value = value;
    }
}
