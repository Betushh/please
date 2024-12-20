package MentorLesson.Lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainL5 {


    public static void main(String[] args) {
        Designer designer = new Designer();
        Developer developer = new Developer();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Designer Salary:");
            int designersSalary = scanner.nextInt();
            designer.setSalaryDesigner(designersSalary);

            System.out.println("Designer extra hours:");
            int designerHours = scanner.nextInt();
            designer.setWorkHourDesigner(designerHours);

            int designerResult = designer.calculateBonus(designersSalary,designerHours);
            System.out.println(designer);

            System.out.println("Developer Salary:");
            int developerSalary = scanner.nextInt();
            developer.setSalaryDeveloper(developerSalary);

            System.out.println("Developer extra hours:");
            int developerHours = scanner.nextInt();
            developer.setWorkHourDeveloper(developerHours);
            int developerResult = designer.calculateBonus(developerSalary,developerHours);
            System.out.println(developer);

            getSalaries(designerResult,developerResult);

        }catch (InputMismatchException a){
            a.getMessage();
        }catch (Exception e){
            e.printStackTrace();
        }



    }

    public static void getSalaries(int designerResult, int developerResult) {
        if(designerResult>developerResult){
            System.out.println("Designer Gets more money = " + designerResult);
        } else if (designerResult == developerResult) {
            System.out.println("Designer and Developer have equal salary and bonus ");
        }else{
            System.out.println("Developer Gets more money = " + developerResult);
        }
    }


}
