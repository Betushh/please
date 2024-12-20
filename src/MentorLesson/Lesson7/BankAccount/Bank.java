package MentorLesson.Lesson7.BankAccount;


public class Bank {
    static SimpleBankAccount[] accounts = new SimpleBankAccount[10];
    private static int count;

    public void addAccount(SimpleBankAccount account) {
        accounts[count] = account;
        count++;
    }

    public void depositToAccount(int index, double amount) {//void

        if (index > count) {
            throw new IllegalArgumentException("Illegal conflict between index and count");
        }
        index--;
       var account = accounts[index];
       account.deposit(amount);
    }

    public void withdrawFromAccount(int index, double amount) {
        if (index > count) {
            throw new IllegalArgumentException("Illegal conflict between index and count");
        }
        index--;
        var account = accounts[index];
        account.withdraw(amount);
    }

    public AccountType getAccountType(int index) {

        if (index > count) {
            throw new IllegalArgumentException("Illegal conflict between index and count");
        }
        index--;
        var account = accounts[index];
        return account.getAccountType();
    }

    public void displayAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i].getBalance() + " " + accounts[i].getAccountType());
        }
    }
}
