package MainLesson.Lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        //other operations
        int num1 = 23;
        num1 = num1 + 1;
        System.out.println("num +1 = " + num1);
        num1 += 2; // a += 1, 2, 67
        System.out.println("num1 += " + num1);
        num1 -= 2;
        System.out.println("num1 -= " + num1);
        num1 *= 2;
        System.out.println("num1 *= " + num1);
        num1 /= 2;
        System.out.println("num1 /= " + num1);
        num1 %= 2;
        System.out.println("num1 %= " + num1);

        num1 = num1++;
        System.out.println("num++ = " + num1);// assign have more preference than preincrement


        int a = 5;
        int b = 22;

        // &&
        System.out.println(a < 5 && b < 7);
        System.out.println(a > 5 && b >= 7);
        System.out.println(!(a < 3 && b > 22)); // gives opposite one

        // exclusive &
        System.out.println(a > 5 & b >= 7);
        System.out.println("exlusive one = " + (b & a));

        // ||
        System.out.println(a < 4 || b < 22);

        //exclusive |
        System.out.println(a < 4 | b < 22);
        System.out.println("exlusive one = " + (a | b));

        //terminaly operator
        int c = a < b ? a : b;
        System.out.println("result = " + c);

        System.out.println(a < (4 | 9));
        boolean bl = a < 11 && b > (13 & (14 | 12));
        boolean cl = (a + b) < 27;
        System.out.println(cl);

        // if statement

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else if (a < 30) {
            System.out.println("a is less than 30");// will not print it cuz system stops t check others
        } else {
            System.out.println("a equals to b");
        }

        // switch case
        switch (a) {
            case (1):
                System.out.println(1);
                break;
            case (2):
                System.out.println(2);
                break;
            case (3):
                System.out.println(3);
                break;
            case (4):
                System.out.println(4);
                break;
            case (5):
                System.out.println(5);
                break;
            default:
                System.out.println("nothing have been found");
        }

//         Loops
//         for
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("end of the loop");

        for (int j = 0; j < 10; j++) {
            if (j == 6) {
                return;
            }
            System.out.println(j);
        }
        System.out.println("end of the loop");

        //while
        int q = 4;
        while (q < 10) {
            System.out.println(q);
            q++;
        }

        //do while
        do {
            System.out.println(q);
            q++;
        } while (q < 10);

    }
}



