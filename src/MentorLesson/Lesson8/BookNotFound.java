package MentorLesson.Lesson8;

import MentorLesson.Lesson7.BankAccount.ExceptionMessage;

public class BookNotFound extends RuntimeException {
    public BookNotFound(String message) {
        super(message);
    }

}
