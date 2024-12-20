package MentorLesson.Lesson7.BankAccount;

import java.util.Arrays;

public enum AccountType {
    SAVING("SAVING"),
    CURRENT("CURRENT");

    private String code;

    AccountType(String code) {
        this.code = code;
    }


}
