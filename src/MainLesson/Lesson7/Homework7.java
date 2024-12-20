package MainLesson.Lesson7;

public class Homework7 {
    String form;
    int leftime;
    boolean effectiveness;

    public Homework7() {
        this.form = "unknown";
        System.out.println("no arg");

    }

    public Homework7(int leftime) {
        this(13, "noh-Human", false);
        this.leftime = leftime;
        int result = 12 + leftime;
        System.out.println(result);
        System.out.println("1 arg");
    }

    public Homework7(int leftime, String form, boolean effectiveness) {
        this();
        this.leftime = leftime;
        this.form = form;
        this.effectiveness = effectiveness;
        System.out.println("3 args");

    }


}
