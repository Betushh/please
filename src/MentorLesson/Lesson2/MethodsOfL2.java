package MentorLesson.Lesson2;

public class MethodsOfL2 {
    String primeNumbers(int number1, int number2) {
        for (int i = number1; i < number2; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    break;
                }
                return "{" +i+"}";
            }
        }
        return "";
    }

    String leapYear(int number) {
        System.out.println("Leap years starts from 1900. Please consider it");
        if (number > 1900 && (number % 4 == 0)) {
            return buildMessage(number, "");
        }
        return buildMessage(number, "not ");
    }

    String buildMessage(int number, String not) {
        return number + " is " + not + "Leap year";
    }

    double getNumbersSum(int n) {
        double sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

   double getNumbersMultiple(int n) {
        double multiple = 1;
        while (n > 0) {
            multiple *= n % 10;
            n /= 10;
        }
        return multiple;
    }


    double getDouble(double a, double b) {
        double doubleOfNum = a / b;
        return doubleOfNum;
    }

    double getNumbersDivide(int n) {
        double multiple = getNumbersMultiple(n);
        double sum = getNumbersSum(n);
        return getDouble(multiple, sum);
    }

    int getReversed(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

}

