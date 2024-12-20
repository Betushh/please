package MentorLesson.Lesson7;

public class Resource implements AutoCloseable {
    public void useResource() {
        System.out.println("Resource is being used");
    }

    @Override
    public void close() throws Exception {
        System.out.println("resource has been closed");
    }
}
