package MentorLesson.Lesson10;

import MentorLesson.Lesson4.Student;

public class Students {
    private String name;
    private String surname;
    private String grade;


    public Students(String name, String surname, String grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
