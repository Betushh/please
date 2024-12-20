package MentorLesson.Lesson7.BankAccount;

public enum ExceptionMessage {
    INSUFFICIENT_BALANCE("Aye Balansada pul yoxdu, qadan alim.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
