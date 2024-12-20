package MainLesson.Lesson22;

import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String a = scanner.next();



            System.out.println("Input: " + isValid(a));

    }

    public static boolean isValid(String s) {

        Stack<Character>order = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {//(
                order.push(i);
            } else if (i == ')' || i == '}' || i == ']') {

                if (order.isEmpty()) {
                    return false;
                }
                char top = order.pop();
                if (i == ')' && top != '(' || i == '}' && top != '{' || i != ']' && top != '[') {
                    return false;
                }
            }
        }

        return order.isEmpty();
    }
    }
