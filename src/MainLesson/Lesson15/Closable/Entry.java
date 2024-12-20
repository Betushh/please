package MainLesson.Lesson15.Closable;

import java.io.Closeable;
import java.io.IOException;

public class Entry implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Entry is closed");
    }

    public int getEntry(int number){
        System.out.println(" Number of entry is "+number);
        return number;
    }
}
