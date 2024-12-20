package MainLesson.Lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) throws IOException {
        /*
        exception-handles the error
         exceptions: checked and unchecked
         checked - compile
         IO
         unchecked - runtime
         arithmetic
         inputmismatch

         throws -  method signaturede exceptionu yazmaq ucundu. possibility
         throw exception calisdirmaq ucundu



         */


 /*       try {
            File file = new File("Error");
            FileInputStream fileInputStream = new FileInputStream(file);
//    }catch(IOException i){
//            i.getMessage();
       }
*/

        int div = getDivide(45,0);
        System.out.println("div = " + div);

        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a + b;
            System.out.println("result = " + result);

            int divide = a / b;
            System.out.println("divide = " + divide);
        } catch (InputMismatchException exception) {
            System.out.println("There is something wring with the input");
            exception.printStackTrace();
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
            arithmeticException.printStackTrace();
        } catch (Exception e) {
            System.out.println(" Ay Human, ERRROR");
        }

        System.out.println("End of the code");
    }

    static int getDivide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("cannot divide by zero");

            }
            return a/b;
        }
    }

