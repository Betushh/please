package MainLesson.Lesson19.Homework;

public enum Season {

    SPRING(1),
    SUMMER(2),
    AUTUMN(3),
    WINTER(4);

    Season(int no ){
        this.no = no;
    }

    private int no;

    public int getNo() {
        return no;
    }
}
