package MainLesson.Lesson10.Films;

import MainLesson.Lesson10.Moviecompanies.Companies;

public class FilmOwners extends Companies {
    public static void main(String[] args) {
        String name = "Orphane";
        Film.thrillerFolms.getThrillerFilm(name);

        Film.ComedyFilms.getComedyFilm("Thor: love and thunder");

    }
    @Override
    protected void getGeneralthinks() {
        System.out.println("All movies are here, you can use it");
    }

    public  class Hopeless extends Film{

    }
    }


