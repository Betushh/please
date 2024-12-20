package MainLesson.Lesson21.PaymentSystemOVersion;

public class Payment1 {


    public <T extends String, K extends Number>void pay(T provider, K amount) {
        switch (provider.toUpperCase()) {
            case "MAESTRO":
               Maestro<Double> maestro = new Maestro<>(2.4);
                System.out.println(maestro.pay(amount.doubleValue()));
                break;

            case "VISA":
                Visa<Double> visaOVersion = new Visa<>(3.0);
                System.out.println(visaOVersion.pay(amount.doubleValue()));
                break;

            case "MASTERCARD":
                Mastercard<Double> mastercard = new Mastercard<>(3.5);
                System.out.println(mastercard.pay(amount.doubleValue()));
                break;
            default:
                System.out.println("Incorrect Provider");
        }
    }
}
