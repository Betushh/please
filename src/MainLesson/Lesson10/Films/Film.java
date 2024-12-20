package MainLesson.Lesson10.Films;

public class Film {
    final String name = "Film name";
    String place;
    int numberofdates;

//    public static void main(String[] args) {
//        FilmOwners filmOwners = new FilmOwners();
//        filmOwners.getGeneralthinks();
//    }


    public void getInfo(String name, String place, int numberofdates) {
        // this.name = name;
        this.place = place;
        this.numberofdates = numberofdates;
        System.out.print("our Movie info is:" + name + " " + place + " " + numberofdates);
    }


    public class ActionFilms {
        public static void getActionFilm(String name) {
            System.out.println("Action Movie:" + name);
        }
    }

    class thrillerFolms {
        public static void getThrillerFilm(String name) {
            System.out.println("Thriller Movie:" + name);
        }
    }

    protected class ComedyFilms {
        public static void getComedyFilm(String name) {
            System.out.println("Comedy Movie:" + name);
        }
    }

    private class HorrorFilms {
        public static void getHorrorFilm(String name) {
            System.out.println("Horror Movie:" + name);
        }
    }


}
