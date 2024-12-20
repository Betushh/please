package MainLesson.Lesson20;

@MyAnnotation
public class Test {

    @MyFieldAnnotation
    private int index;

    public Test(int index) {
        this.index = index;

    }

@MyMethodAnnotation(count = 3)
    private String getTestNumber(int count) {
    return   "this is our method " + count;
    }
}
