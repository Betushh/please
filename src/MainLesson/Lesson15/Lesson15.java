package MainLesson.Lesson15;

import MainLesson.Lesson10.Films.Film;
import MainLesson.Lesson15.Closable.Entry;
import MainLesson.Lesson15.Closable.Exit;
import MainLesson.Lesson15.Closable.MainHall;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Lesson15 {

    // finally block always works
    // closable olan classlari auto close edir
    // sonuncu yaradan ilk close olur
    

    public static void main(String[] args) throws IOException {

        try (Entry entry = new Entry(); MainHall mainHall = new MainHall(); Exit exit = new Exit()) {
            entry.getEntry(4);
            mainHall.getMainHalll(3);
            exit.getExit(6);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("It is finally finished");
        }








/*
        try(FileInputStream fileInputStream =  new FileInputStream(new File("Info.txt"))){
            fileInputStream.readAllBytes();
        }catch (Exception e){
            e.printStackTrace();
        }


 without try with resources
        FileInputStream fileInputStream = null;

        try {
            File file = new File("Info.txt");
           fileInputStream =  new FileInputStream(file);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }


 */

        int a = 3;
        int b = 2;

        int res = getDivideResult(a, b);
        System.out.println("res = " + res);

    }

    static public int getDivideResult(int a, int b) {
        int result = 0;


        try {
            result = a / b;
            return result;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("everyThing is finished");
        }

        System.out.println("End of the code");

        return 0;
    }
}
