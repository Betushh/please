package MainLesson.Lesson21.PaymentSystemOVersion;

public class Visa<T extends Number> implements PaymentTypeOVersion {
    T bonus;
    public Visa(T bonus) {
        this.bonus = bonus;
    }

    public String pay(T amount) {
        if (amount.doubleValue() > 0) {
            return "You paid:" + amount + " | Your cashback from this amount:" + amount.doubleValue() * bonus.doubleValue() / 100;
        }
        return "Amount is not right.";
    }
}
