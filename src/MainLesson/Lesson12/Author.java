package MainLesson.Lesson12;

public class Author {
    private String name;
    private String surname;
    private int id;
    private Book book;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }


    @Override
    public String toString() {
        return "Author: {name: " + getName() + ", surname: " + getSurname() + ", Id: " + getId() + ", Book: " + getBook() + " }";
    }

}
