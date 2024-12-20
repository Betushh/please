package MentorLesson.Lesson4;

import java.util.Scanner;

public class Student {
    String name;
    String surname;
    int age;
    private int id;/////////
    private int grade;
    static Student[] studentList = new Student[100];

    static int lastIndex;//// id

    public Student() {

    }

    public Student(String name, String surname, int age, int grade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;

    }


    // 1
    public void getOperationOne(int numberOfStudents, Scanner scanner) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((lastIndex + 1) + "-ci student ucun ad daxil edin");
            String name = scanner.next();
            System.out.println((lastIndex + 1) + "-ci student ucun soyad daxil edin");
            String surname = scanner.next();
            System.out.println((lastIndex + 1) + "-ci student ucun yas daxil edin");
            int age = scanner.nextInt();
            System.out.println((lastIndex + 1) + "-ci student ucun  bal daxil edin");
            int grade = scanner.nextInt();
            setGrade(grade);
            studentList[lastIndex] = new Student(name, surname, age, getGrade());
            lastIndex++;
            System.out.println("[Student " + (i + 1) + "] = " + name + " " + surname + " " + age + " " + grade);
        }
    }


    //2

    public void getOperationTwo() {
        Student student = new Student();
            System.out.println(student);

    }

    //3
    public void getOperationThree(int byIndex) {
        byIndex--;
        if (byIndex < lastIndex && byIndex >= 0) {
            System.out.println("[Student " + (byIndex + 1) + "] = " + studentList[byIndex].name +
                    " " + studentList[byIndex].surname +
                    " " + studentList[byIndex].age);
        } else {
            getOperationTwo();

        }
    }

    //4
    public String getOperationFour(String searchingName) {
        for (int i = 0; i < lastIndex; i++) {
            if (searchingName.equalsIgnoreCase(studentList[i].name)) {
                return "Our searched name is: [Student " + (i + 1) + "] = " + studentList[i].name +
                        " " + studentList[i].surname +
                        " " + studentList[i].age;
            }

        }
        System.out.println("Student name was not found. Please select from this list:");
        getOperationTwo();
        return "";

    }

    //5
    public String getOperationFive() {
        //3
        for (int i = 0; i < lastIndex; i++) {
            for (int j = 0; j < i; j++) {
                if (studentList[i].name.equalsIgnoreCase(studentList[j].name)) {
                    System.out.println("Students with the same names:");
                    System.out.println("[Student " + (j + 1) + "] = " + studentList[j].name + " " + studentList[j].surname +
                            " " + studentList[j].age);
                    System.out.println("[Student " + (i + 1) + "] = " + studentList[i].name + " " + studentList[i].surname +
                            " " + studentList[i].age);
                    break;
                }
            }
        }
        // hemise verir
        return "There is no student with same name";
    }

    //6
    public String getOperationSix(int replacement, int selectSection, String changeWord) {

        switch (selectSection) {
            case (1):
                replacement--;
                if (replacement <= lastIndex && replacement >= 0) {
                    studentList[replacement].name = changeWord;
                    System.out.println("[Student " + (replacement + 1) + "] = " + studentList[replacement].name +
                            " " + studentList[replacement].surname +
                            " " + studentList[replacement].age);
                } else {
                    System.out.println(" With due respect, Please enter inputs correctly");
                }
                break;
            case (2):
                replacement--;
                if (replacement <= lastIndex && replacement > 0) {
                    studentList[replacement].surname = changeWord;
                    System.out.println("[Student " + (replacement + 1) + "] = " + studentList[replacement].name +
                            " " + studentList[replacement].surname +
                            " " + studentList[replacement].age);
                } else {
                    System.out.println(" With due respect, Please enter inputs correctly");
                }
        }
        return "Selection is incorrect. Please choose 1 (name) or 2 (surname)";
    }

    //7
    public double getAverageGrade() {
        if (studentList == null) {
            throw new NullPointerException("Grades are not available for this student.");
        }
        double sum = 0;
        for (int i = 0; i < lastIndex; i++) {
            sum += studentList[i].grade;
        }
        double result = sum / lastIndex;
        return result;
    }

    public String getMaxGPA(){
        double max = 0;
        String maxStudent = null;
        if (studentList == null) {
            throw new NullPointerException("Grades are not available for this student.");
        }
        for (int i = 0; i < lastIndex; i++) {
            if(max < studentList[i].grade){
                max = studentList[i].grade;
                 maxStudent = "[Student " + (i + 1) + "] = " + studentList[i].name + " " + studentList[i].surname + " " + studentList[i].age + " " + studentList[i].grade;
            }
            if(max== 0){
                throw new NullPointerException("There is no grades");
            }
        }
       return "Max Gpa student: "+maxStudent;
    }

    //set grade, id

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = lastIndex;
    }

    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        return (this.id == 0 && student.id == 0 && this.id == student.id);
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (id != 0) {
            result = 31 * result + Integer.valueOf(id).hashCode();
        }

        return result;
    }



    // toString

    @Override
    public String toString() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println("Student{" +
                    "name='" + studentList[i].name + '\'' +
                    ", surname='" + studentList[i].surname + '\'' +
                    ", age=" + studentList[i].age +
                    ", id='" + studentList[i].getId() + '\'' +
                    ", grade=" + studentList[i].getGrade() +
                    '}');
        }
        return "";
    }

}






