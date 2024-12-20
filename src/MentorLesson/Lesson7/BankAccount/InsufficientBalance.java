package MentorLesson.Lesson7.BankAccount;

public class InsufficientBalance extends RuntimeException {
    public InsufficientBalance(String message) {
        super(message);
    }

    public InsufficientBalance(){
        super(ExceptionMessage.INSUFFICIENT_BALANCE.getMessage());
    }

    public static InsufficientBalance insufficientBalance(){
        return new InsufficientBalance();
    }
}
