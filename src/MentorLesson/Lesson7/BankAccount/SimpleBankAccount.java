package MentorLesson.Lesson7.BankAccount;

public class SimpleBankAccount implements BankAccount {
    private double balance;
    private final AccountType accountType;

    public SimpleBankAccount(AccountType accountType) {
        this.accountType = accountType;
    }

    public SimpleBankAccount(double balance, AccountType accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalance {
        if (balance < amount) {
            throw InsufficientBalance.insufficientBalance();
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
