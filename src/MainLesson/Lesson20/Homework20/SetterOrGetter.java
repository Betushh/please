package MainLesson.Lesson20.Homework20;


import MainLesson.Lesson20.SetterAnnotation;

public class SetterOrGetter {
    private String name;

    @GetterAnnotation
    @HWMethodAnnotation()
    public String getName() {
        System.out.println("This is getter method");
        return name;
    }

    @SetterAnnotation
    public void setName(String name) {
        System.out.println("This is setter method");
        this.name = name;
    }
}
