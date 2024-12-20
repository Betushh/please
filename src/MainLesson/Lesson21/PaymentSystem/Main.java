package MainLesson.Lesson21.PaymentSystem;

import MainLesson.Lesson21.PaymentSystemOVersion.Payment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Payment providers: Maestro, Visa, Mastercard");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter which payment provider you want to use:");
            String provider = scanner.next();
            System.out.println("Please enter your payment amount:");
            double amount = scanner.nextDouble();

            Payment<PaymentSystem> payment = new Payment(new PaymentSystem());
            payment.pay(provider, amount);
        }catch (InputMismatchException e){
            e.getMessage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
