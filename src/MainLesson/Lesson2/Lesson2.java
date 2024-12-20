package MainLesson.Lesson2;

import java.util.Scanner;

public class Lesson2 {
public static void main(String[] args){

    // int examples
    int a = 12;
    int b = 2;
//    System.out.println(a+b);
//    System.out.println(a = b);
//


//    int minus = a - b;
//    System.out.println("Result = " + minus);
//
//    int multiple = a * b;
//    System.out.println("Result = " + multiple);
//
//    int divide = a / b;
//    System.out.println("Result = " + divide);
//
//    int percentage = a % b;
//    System.out.println("Percentage = " + percentage);

    //increment and decrement
    int inc = a++;
    System.out.println("Inc = " + inc);

    int inc1 = ++a;
    System.out.println("Inc1 = " + inc1);

    int dec = a--;
    System.out.println("Dec = " + dec);

    int dec1 = --a;
    System.out.println("Dec1 = " + dec1);

    int otherSide = ++a;
    System.out.println("OtherSide = " + otherSide);

    int otherside1 = --a;
    System.out.println("OtherSide 1 = " + otherside1);

//    int mixOfThem = b++ + ++b;
//    System.out.println("MixOfThem = " + mixOfThem);
//    System.out.println("b = " + b);

    int trickyOne = ++b + ++b + b-- + --b + b + b++;
    System.out.println("TrickyOne = " + trickyOne);
    System.out.println(" new b = " + b);


    // long example
    long valueOfLong = 1_000_000L;

    // short example
    short domainExpansion = 11;

    // byte example -128  127
    byte bytesOf13Folders = 33;

    // float examples
    float finalDecision1 = 111.1F;
    float finalDecision2 = 200.45F;
    float finalDiv = finalDecision1 / finalDecision2;
    System.out.println("final divide = " + finalDiv);

    float div1 = (float) a / (float) b;
    System.out.println("div1 = " + div1);

    // double example
    double db = 3334.3D;
    double div = (double) a / (double) b;
    System.out.println("Div = " + div);

    double a1 = 13;
    double b1 = 7;
    double divide1 = a1 / b1;
    System.out.println("Result = " + divide1);

    // boolean examples
    boolean bl = true;

    boolean com = (a > b);
    System.out.println("Com = " + com);
    System.out.println(a > b);

    boolean com1 = (a >= b);
    System.out.println("Com 1 = " + com1);

    boolean com2 = (a < b);
    System.out.println("Com  2 = " + com2);

    boolean com3 = (a <= b);
    System.out.println("Com 3 = " + com3);

    boolean equal = (a == b);
    System.out.println("Equal = " + equal);

    boolean equal1 = (a != b);
    System.out.println("Equal = " + equal1);

    // char examples
    char c = 'W';
    char c1 = '=';
    int cc = c1;
    System.out.println("cc = " + cc);

    // String examples
    String s$t = "something";
    String name_1 = "Daniel";
    String name_2 = "Riccardo";
    System.out.println(name_1 +" " + name_2);
    System.out.println(name_1 + name_2 + a + b);
    System.out.println(a + b + name_1 + name_2);

    //change int to long
    int forLong = 6543;
    long biggerVersion = forLong;
    System.out.println("Long bigger version = "+forLong);

    //change long to int
    long forInt = 3456;
    int smallerVersion = (int) forInt;
    System.out.println("Long smaller version = "+forInt);

    //boundary problem
    int q = 129;
    byte p = (byte) q;
    System.out.println("boundary problem = "+p);

    // input the numbers
    Scanner scanner = new Scanner (System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int result = number1 + number2;
    System.out.println("result = "+result);



    //Homework 1
    Scanner scanner1 = new Scanner(System.in);
    int w = scanner1.nextInt();

    //200
    int divide200 = w / 200;
    int remain200 = w % 200;
    System.out.println("Divide 200 = " + divide200);
    System.out.println("Remain 200 = " + remain200);

    //100
    int divide100 = w / 100;
    int remain100 = w % 100;
    System.out.println("Divide 100 = " + divide100);
    System.out.println("Remain 100 = " + remain100);

    //50
    int divide50 = w / 50;
    int remain50 = w % 50;
    System.out.println("Divide 50 = " + divide50);
    System.out.println("Remain 50 = " + remain50);

    //20
    int divide20 = w / 20;
    int remain20 = w % 20;
    System.out.println("Divide 20 = " + divide20);
    System.out.println("Remain 20 = " + remain20);

    //10
    int divide10 = w / 10;
    int remain10 = w % 10;
    System.out.println("Divide 10 = " + divide10);
    System.out.println("Remain 10 = " + remain10);

    //5
    int divide5 = w / 5;
    int remain5 = w % 5;
    System.out.println("Divide 10 = " + divide5);
    System.out.println("Remain 10 = " + remain5);

    //1
    int remain2 = w % 1;
    System.out.println("Remain 10 = " + remain2);



}
}