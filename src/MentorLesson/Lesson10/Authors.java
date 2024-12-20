package MentorLesson.Lesson10;

import MentorLesson.Lesson8.Book;

import java.util.List;

public class Authors {
    private String fullName;
  private   List<Book> bookList;

  public Authors(String fullName, List<Book> bookList){
      this.fullName = fullName;
      this.bookList = bookList;
  }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "fullName='" + fullName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
