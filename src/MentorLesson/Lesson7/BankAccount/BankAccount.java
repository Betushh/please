package MentorLesson.Lesson7.BankAccount;


public interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount) throws InsufficientBalance;

    double getBalance();

    AccountType getAccountType();
}
