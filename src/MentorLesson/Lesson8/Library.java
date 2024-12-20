package MentorLesson.Lesson8;

public class Library {
    static Book[] books = new Book[10];
    private static int count;

    public void addBook(Book book) {
        books[count] = book;
        count++;
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].getTitle());
        }
    }

    public String findBookByTitle(String title) {
            for (int i = 0; i < count; i++) {
                if (books[i].getTitle().equalsIgnoreCase(title)) {
                    return title;
                }
            }
            throw new BookNotFound("no no no");
    }
}
