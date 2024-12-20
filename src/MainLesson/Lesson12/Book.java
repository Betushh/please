package MainLesson.Lesson12;


public class Book extends Author {
    private String genre;
    private int publishAmount;

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setPublishAmount(int publishAmount) {
        this.publishAmount = publishAmount;
    }

    public int getPublishAmount() {
        return publishAmount;
    }

    @Override
    public String toString() {
        return "Book genre: " + getGenre() + ", publish amount: " + getPublishAmount();
    }

}
