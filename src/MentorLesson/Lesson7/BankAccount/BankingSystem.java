package MentorLesson.Lesson7.BankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        try {
            while (true) {
                System.out.println("\nWelcome to Phoenix bank. Please enter what you want to do:\n1. Add Account\n2. Put deposit into your account:\n3. Withdraw your money from account\n" +
                        "4. Display all the accounts\n5. Shut down the ATM");
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        SimpleBankAccount simpleBankAccount = new SimpleBankAccount(AccountType.CURRENT);
                        bank.addAccount(simpleBankAccount);
                        System.out.println("Account has been created. Your current account's amount: " + simpleBankAccount.getBalance());
                        break;
                    case 2:
                        System.out.println("Please add which account you want put deposit:");
                        int indexDeposit = scanner.nextInt();

                        System.out.println("Please add deposit amount:");
                        double depositAmount = scanner.nextDouble();

                        System.out.println("Your amount added ");
                        bank.depositToAccount(indexDeposit, depositAmount);

                        break;
                    case 3:
                        System.out.println("Please add which account you want withdraw money:");
                        int indexWithdraw = scanner.nextInt();

                        System.out.println("Please add withdraw amount:");
                        double withdrawAmount = scanner.nextDouble();
                        System.out.println("Your money withdrew ");
                        bank.withdrawFromAccount(indexWithdraw, withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Showing all the Accounts:");
                        bank.displayAccounts();
                        break;
                    case 5:
                        System.out.println("Ending the operation.");
                        return;
                    default:
                        System.out.println("Please select operation correctly.");
                }
            }
        } catch (InputMismatchException i) {
            throw new InputMismatchException("MISMATCH");
        }

    }
}
