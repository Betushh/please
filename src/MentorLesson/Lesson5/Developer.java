package MentorLesson.Lesson5;

public class Developer extends Employee{
    private int salaryDeveloper;
    private int workHourDeveloper;

    public int getSalaryDeveloper() {
        return salaryDeveloper;
    }

    public void setSalaryDeveloper(int salaryDeveloper) {
        this.salaryDeveloper = salaryDeveloper;
    }

    public int getWorkHourDeveloper() {
        return workHourDeveloper;
    }

    public void setWorkHourDeveloper(int workHourDeveloper) {
        this.workHourDeveloper = workHourDeveloper;
    }

    @Override
    protected int calculateBonus(int salaryDeveloper, int workHourDeveloper) {
        return workHourDeveloper * 100 +salaryDeveloper;
    }

    @Override
    public String toString() {
        return "Developer{" + "salaryDeveloper=" + salaryDeveloper + ", workHourDeveloper=" + workHourDeveloper + " Bonus of Designer = "+ calculateBonus(salaryDeveloper,workHourDeveloper)+'}';
    }


}
