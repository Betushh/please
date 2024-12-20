package MainLesson.Lesson21.PaymentSystem;

public class Payment<T extends PaymentSystem> {
  private T method;
    public Payment(T method){
        this.method = method;
    }

    public <T extends String, H extends Number>void pay(T provider, H amount) {

        switch (provider.toUpperCase()) {
            case "MAESTRO":
                String maestro = method.pay(amount, 5d);
                System.out.println(maestro);
                break;

            case "VISA":
                String visa = method.pay(amount,3.0d);
                System.out.println(visa);
                break;

            case "MASTERCARD":
                String mastercard = method.pay(amount,2.2d);
                System.out.println(mastercard);
                break;
            default:
                System.out.println("Incorrect Provider");
        }
    }
}
