package MainLesson.Lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {

//
//        Scanner scanner = new Scanner(System.in);
//        String name1 = scanner.next();
//        String name2 = scanner.next();
//        getEqualNames(name1, name2);

        String name = "       Daniel Riccardo     is    a Legend        ";
        String name1 = "Never odd or even";
        String text = "AcBd";
        String zeroSpaceText = text.replace(" ", "");
        String withoutPuncText = zeroSpaceText.replace(".","");



              findNamesNumber(name);
        //      findPalindrome(name1);

   //   getAlphabet(text,2);

    }


    static void getEqualNames(String name1, String name2) {
        String newName1 = name1.toUpperCase();
        String newName2 = name2.toUpperCase();

        System.out.println(newName1.equals(newName2));
    }


    static void findNamesNumber(String name) {
        int a = 0;
        for (String str : name.split(" ")) {
            if (str.equals("")) {
                continue;
            }
            a++;
//            System.out.println(str);
        }
        System.out.println("Our word count in this String is " + a);
    }

    static void findPalindrome(String name) {
        String name1 = name.toLowerCase().replace(" ", "");
        String newName = name + ": This String is palindrome";
        for (int i = 0; i < name1.length(); i++) {
            if (name1.charAt(i) != name1.charAt(name1.length() - i - 1)) {
                newName = name + ": This String is NOT palindrome";
                break;
            }
        }
        System.out.println(newName);
    }



    static void getAlphabet(String text, int encrypt) {//solve it
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] textAlp = alphabet.split("");
        for(int i = 0; i< alphabet.length();i++){
            System.out.println(textAlp[i]);
        }
    }


            }






