package MentorLesson.Lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] a = {1, 1, 2, 3, 2, 4};
        Integer[] b = {2, 66, 9, 12, 6};
        Integer[] c = {1, 3};

        //      getListSort(List.of(a),List.of(b));
        //          getDuplicate(a);
//             System.out.println(getSubSet(List.of(c), List.of(a)));


        List<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Conjuring", Genre.HORROR, 100);
        Movie movie2 = new Movie("Conjuring", Genre.THRILLER, 5);
        Movie movie3 = new Movie("it", Genre.HORROR, 7);
        Movie movie4 = new Movie("Ehmed Haradadir", Genre.HORROR, 9);

        addMovie(movieList, movie1);
        //    addMovie(movieList, movie2);
        addMovie(movieList, movie3);
        addMovie(movieList, movie4);

        //   getMovies(movieList);
        //    getTitle(movieList, "it");


    }


    public static void addMovie(List<Movie> movieList, Movie movie) {
        boolean isMatchingMovie = movieList.stream()
                .anyMatch(movie1 -> movie1.getTitle().equalsIgnoreCase(movie.getTitle()));
        if (isMatchingMovie) {
            throw new AlreadyExist("we lready have it");
        }

        if (!movieList.contains(movie)) {
            movieList.add(movie);
        }

    }

    public static void getMovies(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    public static void getTitle(List<Movie> movieList, String title) {
        for (Movie movie : movieList) {

            if (movie.getTitle().equals(title)) {
                System.out.println("we have it: " + movie + movie.getTitle());
            }
        }
    }


    //Duplicate
    public static void getDuplicate(Integer[] array) {

        List<Integer> list = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();

//        List<Integer> list2 = new ArrayList<>(List.of(array));
//        Integer res = 0;
//        for (int i = 0; i < array.length; i++) {
//            var bb = array[i];
//            list2.remove(bb);
//            if (!list2.contains(bb)) {
//                res = array[i];
//                break;
//            }
//            list2.add(bb);
//        }
//
//        System.out.println("res = " + res);

        for (int i : array) {
            if (duplicate.contains(i)) {
                continue;
            }
            if (list.contains(i)) {
                duplicate.add(i);
                list.remove(array[i]);
            } else {
                list.add(i);
            }
        }

        if (duplicate.isEmpty()) {
            System.out.println("there is no");
        } else {
            System.out.println(list.getFirst());
        }

        System.out.println(list);
        System.out.println(duplicate);


    }

    // Sort
    public static void getListSort(List<Integer> list1, List<Integer> list2) {

        List<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);

        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }


    public static Boolean getSubSet(List<Integer> sublist, List<Integer> list) {

        if (sublist.size() > list.size()) {
            return false;
        }

        var copyList = new ArrayList<>(sublist);
        for (Integer i : sublist) {
            if (list.contains(i)) {
                copyList.remove(i);
            }
        }

        return copyList.isEmpty() ? Boolean.TRUE : Boolean.FALSE;
    }

}
