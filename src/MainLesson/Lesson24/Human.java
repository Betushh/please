package MainLesson.Lesson24;

public class Human {
    private String name;
    private int id;

    public Human(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
