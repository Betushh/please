package MainLesson.Lesson21.PaymentSystemOVersion;

public class PaymentSystem1OVersion<T> implements PaymentTypeOVersion {
     T bonus;

    public PaymentSystem1OVersion(T bonus) {
        this.bonus = bonus;
    }
}
