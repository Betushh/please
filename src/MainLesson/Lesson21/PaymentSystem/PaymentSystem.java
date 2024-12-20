package MainLesson.Lesson21.PaymentSystem;

public class PaymentSystem<T extends Number, K extends Number> {

    public String pay(T amount, K bonus) {
        if (amount.doubleValue() > 0) {
            return "You paid:" + amount + " | Your cashback from this amount:" + amount.doubleValue() * bonus.doubleValue() / 100;
        }
        return "Amount is not right.";
    }

}
