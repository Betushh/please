package MentorLesson.Lesson9;

import java.util.Objects;

public class Movie {
  private static int id;
  private String title;
   private Genre genre;
  private   Integer rating;

    public Movie( String title, Genre genre, Integer rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        id++;
        if(rating>10){
            throw new AlreadyExist("olmazzzz");

        }
    }


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Movie.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return Objects.equals(title, movie.title) && genre == movie.genre && Objects.equals(rating, movie.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}

