package MainLesson.Lesson15.Closable;

import java.io.Closeable;
import java.io.IOException;

public class Exit implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Exit is closed");
    }

    public int getExit(int number){
        System.out.println(" Number of exit is "+number);
        return number;
    }
}
