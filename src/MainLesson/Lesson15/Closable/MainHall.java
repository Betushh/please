package MainLesson.Lesson15.Closable;

import java.io.Closeable;
import java.io.IOException;

public class MainHall implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("MainHall is closed");
    }

    public int getMainHalll(int number){
        System.out.println(" Number of main hall is "+number);
        return number;
    }
}
