package MainLesson.Lesson24;

@FunctionalInterface// it shows that we use lambda and need only one abstract variable
public interface Writer {
    String writeName(String name , String secondName); // if we use lambda for this, in this interface we need to have only one abstract method, we can have other methods too or variables, ONLT ON ABSTRACT METHOD!

}
