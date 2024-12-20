package MentorLesson.Lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainL4 {
    public static void main(String[] args) {
        System.out.println("1: Register a student\n2: Show all the students\n3: Find a student according student's index\n4: Find a student according student's name" +
                "\n5: Find students with the same name\n6: Change students' name or surname\n7: Find Average GPA\n8: Find max GPA\n9: Stop the program");

        Student student = new Student();

        while (true) {
            System.out.println("Please select your operation: 1, 2, 3, 4, 5, 6, 7, 8, 9");
            Scanner scanner = new Scanner(System.in);
            int numberOfOperation = scanner.nextInt();
            switch (numberOfOperation) {
                case (1):
                    System.out.println("Please choose how many students you want to register.");
                    int numberOfStudents = scanner.nextInt();
                    student.getOperationOne(numberOfStudents, scanner);
                    break;
                case (2):
                    System.out.println("All the students:");
                    student.getOperationTwo();
                    break;
                case (3):
                    System.out.println("Please choose which students you want to register.");
                    int index = scanner.nextInt();
                    student.getOperationThree(index);
                    break;
                case (4):
                    System.out.println("Please write the name you want to search");
                    String searchName = scanner.next();
                    System.out.println(student.getOperationFour(searchName));
                    break;
                case (5):
                    System.out.println(student.getOperationFive());
                    break;
                case (6):
                    System.out.println("Please choose which student you want change name or Surname ");
                    int findReplacement = scanner.nextInt();
                    student.getOperationThree(findReplacement);
                    System.out.println("Please choose you want change name(1) or surname(2) of the student.");
                    int section = scanner.nextInt();
                    System.out.println("Pleace replace:");
                    String change = scanner.next();
                    student.getOperationSix(findReplacement, section, change);
                    break;
                case (7):
                    System.out.println("Average Gpa of students is: " + student.getAverageGrade());
                    break;
                case (8):
                    System.out.println(student.getMaxGPA());
                    break;
                case (9):
                    System.out.println("The program has been stopped");
                    return;
                default:
                    System.out.println("Operation is incorrect.");

            }

        }
    }
}
