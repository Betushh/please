package MainLesson.Lesson21;

import MainLesson.Lesson10.Films.FilmOwners;
import MainLesson.Lesson10.Moviecompanies.Companies;
import MentorLesson.Lesson4.Student;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        SthWrite<FilmOwners> sthWrite = new SthWrite<>(new FilmOwners());
        sthWrite.write();
        System.out.println(getSth(11111111, "hullo"));
     //   getList(new FilmOwners());
    }

    public static <T, H> T getSth(T sth, H hl){
        System.out.println(hl);
        return sth ;

    }

    public static void getList(List<? extends Companies> list){// in ? no return
        System.out.println(list);
    }
}
